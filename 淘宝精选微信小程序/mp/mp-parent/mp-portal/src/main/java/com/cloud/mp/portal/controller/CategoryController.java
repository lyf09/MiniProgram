package com.cloud.mp.portal.controller;

import com.cloud.infrastructure.common.beans.PageResultBean;
import com.cloud.infrastructure.common.beans.PagerInfo;
import com.cloud.mp.domain.Category;
import com.cloud.mp.domain.CategoryExample;
import com.cloud.mp.domain.Product;
import com.cloud.mp.domain.ProductExample;
import com.cloud.mp.service.CategoryService;
import com.cloud.mp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.cloud.infrastructure.common.utils.function.FunctionUtils.isNullOrEmpty;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("index")
    public String index(){
        return "category/index";
    }

    @RequestMapping("")
    @ResponseBody
    public PageResultBean<Product> lists(Category category, PagerInfo page){
        CategoryExample example = new CategoryExample();
        CategoryExample.Criteria criteria = example.createCriteria();

        //按字段排序
        if (!isNullOrEmpty(page.getOrderBy())) {
            example.setOrderByClause(page.getOrderBy() + " " + page.getSort());
        }
        return new PageResultBean<>(categoryService.lists(example, page));
    }
}
