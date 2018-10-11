package com.cloud.infrastructure.abstracts.impl;


import com.cloud.infrastructure.abstracts.AbstractMapper;
import com.cloud.infrastructure.abstracts.AbstractService;
import com.cloud.infrastructure.common.utils.pagination.PageBean;
import com.cloud.infrastructure.common.utils.pagination.PageParam;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.io.Serializable;

public abstract class AbstractServiceImpl<T, PK extends Serializable> implements AbstractService<T, PK> {

    public abstract AbstractMapper<T, PK> getMapper();

    public T save(T entity) {
        return this.getMapper().insert(entity) > 0 ? entity : null;
    }

    public Boolean remove(PK id) {
        return this.getMapper().deleteByPrimaryKey(id) > 0;
    }

    public T update(T entity) {
        return this.getMapper().updateByPrimaryKeySelective(entity) > 0 ? entity : null;
    }

    public T getOne(PK id) {
        return this.getMapper().selectByPrimaryKey(id);
    }

    public PageBean<T> list(PageParam pageParam) {
        System.out.println(pageParam);
        //物理分页
        PageHelper.startPage(pageParam.getPageIndex(), pageParam.getPageSize());

        //单字段排序
        if(pageParam.getOrderBy() != null && !pageParam.getOrderBy().equals("")){
            PageHelper.orderBy(pageParam.getOrderBy() + " " + pageParam.getSort());
        }

        //分页结果集
        PageInfo<T> pageInfo = new PageInfo<>(this.getMapper().list(pageParam));

        //包装结果集
        return new PageBean<T>(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getList());
    }
}
