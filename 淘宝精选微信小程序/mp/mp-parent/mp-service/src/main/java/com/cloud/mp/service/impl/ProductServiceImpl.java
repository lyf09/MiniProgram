package com.cloud.mp.service.impl;

import com.cloud.infrastructure.common.beans.PagerInfo;
import com.cloud.infrastructure.common.utils.http.HttpUtils;
import com.cloud.infrastructure.common.utils.json.JsonUtils;
import com.cloud.mp.domain.Product;
import com.cloud.mp.domain.ProductExample;
import com.cloud.mp.mapper.ProductMapper;
import com.cloud.mp.pojo.ItemDesc;
import com.cloud.mp.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public PageInfo<Product> lists(ProductExample example, PagerInfo page) {
        PageHelper.startPage(page.getPageIndex(), page.getPageSize());
        return new PageInfo<Product>(productMapper.selectByExample(example));
    }

    @Override
    public Product getByPk(Integer id) {
        Product product = productMapper.selectByPrimaryKey(id);

        //获取产品详情信息
        if (product.getDescription() != null){
            return product;
        }

        String url = "http://hws.m.taobao.com/cache/mtop.wdetail.getItemDescx/4.1/?data={\"item_num_id\":\"%s\"}";
        String httpResult = HttpUtils.get(String.format(url, product.getItemId()));
        ItemDesc item = JsonUtils.parse(httpResult, ItemDesc.class);

        //转换失败
        if(item == null){
            return product;
        }

        //成功返回了图片详情
        if (item.getData().getImages() != null && item.getData().getImages().size() > 0) {
            product.setDescription(JsonUtils.toJson(item.getData().getImages()));
            //入库
            productMapper.updateByPrimaryKeySelective(product);
        }

        return product;
    }

    @Override
    public List<Product> addAll(List<Product> products) {
        for (Product product : products){
            productMapper.insertSelective(product);
        }
        return products;
    }
}
