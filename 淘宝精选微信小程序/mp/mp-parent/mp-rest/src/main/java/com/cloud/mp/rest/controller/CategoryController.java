package com.cloud.mp.rest.controller;


import com.cloud.infrastructure.common.beans.PageResultBean;
import com.cloud.infrastructure.common.beans.PagerInfo;
import com.cloud.infrastructure.common.beans.ResultBean;

import com.cloud.mp.domain.Category;
import com.cloud.mp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/all")
    public ResultBean<List<Category>> all() {
        return new ResultBean<List<Category>>(categoryService.all());
    }

    @RequestMapping(value = "")
    public PageResultBean<Category> lists(Category category, PagerInfo page) {
        return new PageResultBean<Category>(categoryService.lists(null, page));
    }

    @RequestMapping(value = "/{id}")
    public ResultBean<Category> get(@PathVariable("id") Integer id) {
        return new ResultBean<Category>(categoryService.getByPk(id));
    }

}
