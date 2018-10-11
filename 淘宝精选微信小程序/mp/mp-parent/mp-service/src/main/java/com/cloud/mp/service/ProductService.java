package com.cloud.mp.service;

import com.cloud.infrastructure.common.beans.PagerInfo;
import com.cloud.mp.domain.Product;
import com.cloud.mp.domain.ProductExample;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductService{

    public PageInfo<Product> lists(ProductExample example, PagerInfo page);

    Product getByPk(Integer id);

    List<Product> addAll(List<Product> products);
}
