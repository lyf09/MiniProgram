package com.infrastructure.tbk;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.request.TbkItemGetRequest;
import com.taobao.api.request.TbkItemInfoGetRequest;
import com.taobao.api.request.TbkScCouponSmartRecommendRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;
import com.taobao.api.response.TbkItemGetResponse;
import com.taobao.api.response.TbkItemInfoGetResponse;
import com.taobao.api.response.TbkScCouponSmartRecommendResponse;

public class Item {

    /*
    public static void main(String[] args) throws ApiException {
        String url = "http://gw.api.taobao.com/router/rest";
        String appkey = "23828725";
        String secret = "dd404f0d8f9112404ded7319212ca6e9";
        String pid = "mm_54107337_25422993_94912846";
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
//        req.setStartDsr(10L);
        req.setPageSize(20L);
        req.setPageNo(1L);
        req.setPlatform(1L);
//        req.setEndTkRate(1234L);
//        req.setStartTkRate(1234L);
//        req.setEndPrice(10L);
//        req.setStartPrice(10L);
//        req.setIsOverseas(false);
        req.setIsTmall(false);
        req.setSort("tk_rate_des");
        req.setItemloc("杭州");
        req.setCat("16,18");
        req.setQ("女装");
        req.setMaterialId(2836L);
        req.setHasCoupon(false);
//        req.setIp("13.2.33.4");
        req.setAdzoneId(94912846L);
//        req.setNeedFreeShipment(true);
//        req.setNeedPrepay(true);
//        req.setIncludePayRate30(true);
//        req.setIncludeGoodRate(true);
//        req.setIncludeRfdRate(true);
//        req.setNpxLevel(2L);
//        req.setEndKaTkRate(1234L);
//        req.setStartKaTkRate(1234L);
//        req.setDeviceEncrypt("MD5");
//        req.setDeviceValue("xxx");
//        req.setDeviceType("IMEI");
        TbkDgMaterialOptionalResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
        for (TbkDgMaterialOptionalResponse.MapData map : rsp.getResultList()){
            System.out.println(map.getTitle() + "\t"+map.getCategoryName());
        }
//        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
//        TbkItemInfoGetRequest req = new TbkItemInfoGetRequest();
//        req.setNumIids("540419558842,45218137608");
//        req.setPlatform(1L);
//        req.setIp("115.171.63.37");
//        TbkItemInfoGetResponse rsp = client.execute(req);
//
//        System.out.println(rsp.getResults());
       TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        TbkItemGetRequest req = new TbkItemGetRequest();
        req.setFields("num_iid,title,pict_url,small_images,reserve_price,zk_final_price,user_type,provcity,item_url,seller_id,volume,nick");
        req.setQ("女装");
        req.setCat("16,18");
        req.setItemloc("杭州");
        req.setSort("tk_rate_des");
        req.setIsTmall(false);
        req.setIsOverseas(false);
        req.setStartPrice(10L);
        req.setEndPrice(10L);
        req.setStartTkRate(123L);
        req.setEndTkRate(123L);
        req.setPlatform(1L);
        req.setPageNo(123L);
        req.setPageSize(20L);
        TbkItemGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }
    */
    public static void main(String[] args) throws ApiException {

        String url = "http://gw.api.taobao.com/router/rest";
        String appkey = "23828725";
        String secret = "dd404f0d8f9112404ded7319212ca6e9";
        String pid = "mm_54107337_25422993_94912846";
        String sessionKey = "6102608ac1fb942c1d31519dacfe468390aa6470b31ccc2852952581";
        String refresh_token = "6102708ab4190d0b1f6f512faf060c87afd4250e63690b0852952581";

        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        TbkScCouponSmartRecommendRequest req = new TbkScCouponSmartRecommendRequest();
        req.setPageSize(100L);
        req.setPageNo(1L);
        req.setChannel("zonghe");
        req.setAdzoneId(94912846L);
        req.setSiteId(25422993L);
        TbkScCouponSmartRecommendResponse rsp = client.execute(req, sessionKey);
        System.out.println(rsp.getBody());
    }
}
