package com.infrastructure.tbk;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgItemCouponGetRequest;
import com.taobao.api.response.TbkDgItemCouponGetResponse;

public class DgItemCouponGetRequest {

    public static TbkDgItemCouponGetResponse get(String keywords,Long pageIndex, Long PageSize){
        TaobaoClient client = new DefaultTaobaoClient(Const.url, Const.appkey, Const.secret);
        TbkDgItemCouponGetRequest req = new TbkDgItemCouponGetRequest();
        req.setAdzoneId(Const.adzoneId);
        req.setPlatform(2L);
        //req.setCat("16,18");
        req.setPageSize(100L);
        req.setQ(keywords);
        req.setPageNo(1L);
        try {
            return client.execute(req);
        } catch (ApiException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient(Const.url, Const.appkey, Const.secret);
        TbkDgItemCouponGetRequest req = new TbkDgItemCouponGetRequest();
        req.setAdzoneId(Const.adzoneId);
        req.setPlatform(2L);
        //req.setCat("16,18");
        req.setPageSize(100L);
        req.setQ("女装");
        req.setPageNo(1L);
        TbkDgItemCouponGetResponse rsp = client.execute(req);
        for (TbkDgItemCouponGetResponse.TbkCoupon coupon : rsp.getResults()){
            System.out.println(coupon.getCategory());
            System.out.println(coupon.getTitle());
            //System.out.println(coupon.getItemUrl());
            //System.out.println(coupon.getCouponClickUrl());
        }
    }
}
