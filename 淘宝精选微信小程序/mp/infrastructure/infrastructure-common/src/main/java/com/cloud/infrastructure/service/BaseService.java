package com.cloud.infrastructure.service;

import java.util.List;

public interface BaseService<T, O> {
    public List<T> all();

    public List<T> lists(O example);

    T getByPk(Integer id);
}
