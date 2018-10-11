package com.infrastructure.tbk;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgOptimusMaterialRequest;
import com.taobao.api.response.TbkDgOptimusMaterialResponse;

public class OptimusMaterialRequest {

    public static void main(String[] args)  throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient(Const.url, Const.appkey, Const.secret);
        TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
        req.setPageSize(20L);
        req.setAdzoneId(Const.adzoneId);
        req.setPageNo(1L);
        req.setMaterialId(3756L);
        TbkDgOptimusMaterialResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }
}
