package com.cloud.mp.service;

import com.cloud.infrastructure.common.beans.PagerInfo;
import com.cloud.mp.domain.Category;
import com.cloud.mp.domain.CategoryExample;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CategoryService{

    public List<Category> all();

    public PageInfo<Category> lists(CategoryExample example, PagerInfo page);

    Category getByPk(Integer id);
}
