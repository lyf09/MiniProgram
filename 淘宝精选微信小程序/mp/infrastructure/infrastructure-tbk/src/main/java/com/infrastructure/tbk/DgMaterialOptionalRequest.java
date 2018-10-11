package com.infrastructure.tbk;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;

public class DgMaterialOptionalRequest {

    public static void main(String[] args) throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient(Const.url, Const.appkey, Const.secret);
        TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
        //req.setStartDsr(10L);             //店铺dsr评分，筛选高于等于当前设置的店铺dsr评分的商品0-50000之间
        req.setPageSize(20L);               //页大小，默认20，1~100
        req.setPageNo(1L);                  //第几页，默认：１
        req.setPlatform(2L);                //链接形式：1：PC，2：无线，默认：１
        //req.setEndTkRate(1234L);            //淘客佣金比率上限，如：1234表示12.34%
        //req.setStartTkRate(1234L);          //淘客佣金比率下限，如：1234表示12.34%
        //req.setEndPrice(10L);               //折扣价范围上限，单位：元
        //req.setStartPrice(10L);             //折扣价范围下限，单位：元
        req.setIsOverseas(false);           //是否海外商品，设置为true表示该商品是属于海外商品，设置为false或不设置表示不判断这个属性
        req.setIsTmall(false);              //是否商城商品，设置为true表示该商品是属于淘宝商城商品，设置为false或不设置表示不判断这个属性
        req.setSort("price");         //排序_des（降序），排序_asc（升序），销量（total_sales），淘客佣金比率（tk_rate）， 累计推广量（tk_total_sales），总支出佣金（tk_total_commi），价格（price）
        //req.setItemloc("杭州");               //所在地
        req.setCat("16,18");                //后台类目ID，用,分割，最大10个，该ID可以通过taobao.itemcats.get接口获取到
        req.setQ("女装");                    //查询词
        req.setMaterialId(2836L);           //官方的物料Id(详细物料id见：https://tbk.bbs.taobao.com/detail.html?appId=45301&postId=8576096)，不传时默认为2836
        req.setHasCoupon(true);            //是否有优惠券，设置为true表示该商品有优惠券，设置为false或不设置表示不判断这个属性
        //req.setIp("127.0.0.1");             //ip参数影响邮费获取，如果不传或者传入不准确，邮费无法精准提供
        req.setAdzoneId(Const.adzoneId);     //mm_xxx_xxx_xxx的第三位
        req.setNeedFreeShipment(true);      //是否包邮，true表示包邮，空或false表示不限
        req.setNeedPrepay(true);            //是否加入消费者保障，true表示加入，空或false表示不限
        req.setIncludePayRate30(true);      //成交转化是否高于行业均值
        req.setIncludeGoodRate(true);       //好评率是否高于行业均值
        req.setIncludeRfdRate(true);        //退款率是否低于行业均值
        //req.setNpxLevel(2L);                //牛皮癣程度，取值：1:不限，2:无，3:轻微
        //req.setEndKaTkRate(1234L);          //KA媒体淘客佣金比率上限，如：1234表示12.34%
        //req.setStartKaTkRate(1234L);        //KA媒体淘客佣金比率下限，如：1234表示12.34%
        //req.setDeviceEncrypt("MD5");        //设备号加密类型：MD5
        //req.setDeviceValue("xxx");          //设备号加密后的值
        //req.setDeviceType("IMEI");          //设备号类型：IMEI，或者IDFA，或者UTDID
        TbkDgMaterialOptionalResponse rsp = client.execute(req);
        for (TbkDgMaterialOptionalResponse.MapData map :rsp.getResultList()){
            System.out.println(map.getCouponShareUrl());
        }
    }
}
