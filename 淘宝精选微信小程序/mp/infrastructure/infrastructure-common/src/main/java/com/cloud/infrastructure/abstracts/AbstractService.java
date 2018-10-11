package com.cloud.infrastructure.abstracts;

import com.cloud.infrastructure.common.utils.pagination.PageBean;
import com.cloud.infrastructure.common.utils.pagination.PageParam;

import java.io.Serializable;

public interface AbstractService<T, PK extends Serializable> {
    T save(T entity);

    Boolean remove(PK id);

    T update(T entity);

    T getOne(PK id);

    PageBean<T> list(PageParam pageParam);
}
