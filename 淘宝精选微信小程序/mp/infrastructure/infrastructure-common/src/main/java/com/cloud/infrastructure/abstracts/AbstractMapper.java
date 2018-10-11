package com.cloud.infrastructure.abstracts;

import com.cloud.infrastructure.common.utils.pagination.PageParam;

import java.io.Serializable;
import java.util.List;


public interface AbstractMapper<T, PK extends Serializable> {
    int deleteByPrimaryKey(PK var1);

    int insert(T var1);

    int insertSelective(T var1);

    T selectByPrimaryKey(PK var1);

    int updateByPrimaryKeySelective(T var1);

    int updateByPrimaryKey(T var1);

    List<T> list(PageParam pageParam);
}

