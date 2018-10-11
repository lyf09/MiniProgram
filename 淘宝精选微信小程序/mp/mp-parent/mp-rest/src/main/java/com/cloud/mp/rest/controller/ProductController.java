package com.cloud.mp.rest.controller;

import com.cloud.infrastructure.common.beans.PageResultBean;
import com.cloud.infrastructure.common.beans.PagerInfo;
import com.cloud.infrastructure.common.beans.ResultBean;

import com.cloud.mp.domain.Product;
import com.cloud.mp.domain.ProductExample;
import com.cloud.mp.service.ProductService;
import com.github.pagehelper.PageInfo;
import com.infrastructure.tbk.TpwdCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.cloud.infrastructure.common.utils.function.FunctionUtils.*;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "")
    public PageResultBean<Product> lists(Product product, PagerInfo page) {
        ProductExample example = new ProductExample();
        ProductExample.Criteria criteria = example.createCriteria();

        //分类Id
        if (!isNullOrEmpty(product.getCategoryId())) {
            criteria.andCategoryIdEqualTo(product.getCategoryId());
        }

        //关键字模糊查询
        //if (!isNullOrEmpty(page.getKeywords())) {
        //    ProductExample.Criteria or1 = new ProductExample().createCriteria();
        //    or1.andProductTitleLike("%" + page.getKeywords() + "%");
        //
        //    ProductExample.Criteria or2 = new ProductExample().createCriteria();
        //    or2.andParentCategoryTitleLike("%" + page.getKeywords() + "%");
        //
        //    ProductExample.Criteria or3 = new ProductExample().createCriteria();
        //    or3.andShopTitleLike("%" + page.getKeywords() + "%");
        //
        //    if (!isNullOrEmpty(product.getCategoryId())) {
        //        or1.andCategoryIdEqualTo(product.getCategoryId());
        //        or2.andCategoryIdEqualTo(product.getCategoryId());
        //        or3.andCategoryIdEqualTo(product.getCategoryId());
        //
        //    }
        //    example.or(or1);
        //    example.or(or2);
        //    example.or(or3);
        //}

        //按字段排序
        if (!isNullOrEmpty(page.getOrderBy())) {
            example.setOrderByClause(page.getOrderBy() + " " + page.getSort());
        }

        return new PageResultBean<>(productService.lists(example, page));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResultBean<Product> get(@PathVariable("id") Integer id) {
        return new ResultBean<Product>(productService.getByPk(id));
    }

    @RequestMapping("tpwd")
    public ResultBean<String> tpwd(Integer productId) {
        Product product = productService.getByPk(productId);
        String model = TpwdCreateRequest.get(product.getProductTitle(), product.getCouponShareUrl(), product.getCoverPic()).getData().getModel();
        return new ResultBean<>(model);
    }


    /**
     * 精选产品
     *
     * @param pageInfo
     * @return
     */
    @RequestMapping(value = "/pick")
    public PageResultBean<Product> pick(PagerInfo pageInfo) {
        return new PageResultBean<>(null);
    }

}
