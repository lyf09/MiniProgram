package com.cloud.mp.service.impl;



import com.cloud.infrastructure.common.beans.PagerInfo;
import com.cloud.mp.domain.Category;
import com.cloud.mp.domain.CategoryExample;
import com.cloud.mp.mapper.CategoryMapper;
import com.cloud.mp.service.CategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> all() {
        return categoryMapper.selectByExample(null);
    }

    @Override
    public PageInfo<Category> lists(CategoryExample example, PagerInfo page) {
        PageHelper.startPage(page.getPageIndex(), page.getPageSize());
        return new PageInfo<>(categoryMapper.selectByExample(example));
    }

    @Override
    public Category getByPk(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }
}
