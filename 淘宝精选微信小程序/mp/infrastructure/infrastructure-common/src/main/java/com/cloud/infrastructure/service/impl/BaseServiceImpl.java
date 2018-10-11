package com.cloud.infrastructure.service.impl;

import com.cloud.infrastructure.service.BaseService;

import java.util.List;

public class BaseServiceImpl<T, O> implements BaseService<T, O> {

    @Override
    public List<T> all() {
        return null;
    }

    @Override
    public List<T> lists(O example) {
        return null;
    }

    @Override
    public T getByPk(Integer id) {
        return null;
    }
}
