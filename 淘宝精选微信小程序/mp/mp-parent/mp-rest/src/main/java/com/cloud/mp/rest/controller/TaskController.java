package com.cloud.mp.rest.controller;

import com.cloud.infrastructure.common.utils.DateUtils;
import com.cloud.infrastructure.common.utils.json.JsonUtils;
import com.cloud.mp.domain.Category;
import com.cloud.mp.domain.Product;
import com.cloud.mp.service.CategoryService;
import com.cloud.mp.service.ProductService;
import com.infrastructure.tbk.DgItemCouponGetRequest;
import com.taobao.api.response.TbkDgItemCouponGetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;


    public List<Product> coupon(String keywords, String categoryId, Long pageIndex) {
        List<TbkDgItemCouponGetResponse.TbkCoupon> coupons = DgItemCouponGetRequest.get(keywords, pageIndex, 100L).getResults();

        List<Product> products = new ArrayList<>();
        if (coupons != null) {
            for (TbkDgItemCouponGetResponse.TbkCoupon coupon : coupons) {
                Product product = new Product();
                product.setVolume(coupon.getVolume().intValue());
                //product.setCategoryId(coupon.getCategory().toString());

                product.setCategoryId(categoryId);

                product.setCouponAmount(getCouponAmount(coupon.getCouponInfo()));
                product.setCouponEndTime(DateUtils.parseShort(coupon.getCouponEndTime()));
                product.setItemUrl(coupon.getItemUrl());
                product.setCouponShareUrl(coupon.getCouponClickUrl());
                product.setSmallImages(JsonUtils.toJson(coupon.getSmallImages()));
                product.setCouponStartTime(DateUtils.parseShort(coupon.getCouponStartTime()));
                product.setItemId(coupon.getNumIid().toString());
                product.setCouponInfo(coupon.getCouponInfo());
                product.setCouponTotalCount(coupon.getCouponTotalCount().intValue());
                product.setProductTitle(coupon.getTitle());
                product.setShopTitle(coupon.getShopTitle());
                product.setCouponRemainCount(coupon.getCouponRemainCount().intValue());
                product.setCoverPic(coupon.getPictUrl());
                product.setSellerId(coupon.getSellerId().toString());
                product.setUserType(coupon.getUserType().intValue());
                product.setMarketPrice(Float.parseFloat(coupon.getZkFinalPrice()));
                product.setFinalPrice(product.getMarketPrice() - product.getCouponAmount());

                product.setNickName(coupon.getNick());
                product.setCreateTime(new Date());
                product.setUpdateTime(new Date());
                products.add(product);
            }
        }

        return productService.addAll(products);
    }


    @RequestMapping("get")
    public void get(Long pageIndex) {

        List<Category> categories = categoryService.all();

        for (Category category : categories) {
            coupon(category.getTitle(), category.getCategoryId().toString(), pageIndex);
        }

    }

    public static Float getCouponAmount(String couponInfo) {
        String startStr = "元减";
        int startIndex = couponInfo.indexOf(startStr);
        int endIndex = couponInfo.lastIndexOf("元");
        if (startIndex < 0 || endIndex < 0) {
            return 0F;
        }
        return Float.parseFloat(couponInfo.substring(startIndex, endIndex).substring(startStr.length()));
    }


}
