package com.cloud.mp.portal.controller;

import com.cloud.infrastructure.common.beans.PageResultBean;
import com.cloud.infrastructure.common.beans.PagerInfo;
import com.cloud.infrastructure.common.utils.pagination.PageBean;
import com.cloud.infrastructure.common.utils.pagination.PageParam;
import com.cloud.mp.domain.Product;
import com.cloud.mp.domain.ProductExample;
import com.cloud.mp.service.ProductService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.cloud.infrastructure.common.utils.function.FunctionUtils.isNullOrEmpty;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("index")
    public String index(){
        return "product/index";
    }

    @RequestMapping("")
    @ResponseBody
    public PageResultBean<Product> lists(Product product, PagerInfo page){
        ProductExample example = new ProductExample();
        ProductExample.Criteria criteria = example.createCriteria();
        //分类Id
        if (!isNullOrEmpty(product.getCategoryId())) {
            criteria.andCategoryIdEqualTo(product.getCategoryId());
        }
        //按字段排序
        if (!isNullOrEmpty(page.getOrderBy())) {
            example.setOrderByClause(page.getOrderBy() + " " + page.getSort());
        }
        return new PageResultBean<>(productService.lists(example, page));
    }
}
