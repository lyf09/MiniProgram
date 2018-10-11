package com.infrastructure.tbk;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkTpwdCreateRequest;
import com.taobao.api.response.TbkTpwdCreateResponse;

public class TpwdCreateRequest {

    public static TbkTpwdCreateResponse get(String text, String url, String logo) {
        TaobaoClient client = new DefaultTaobaoClient(Const.url, Const.appkey, Const.secret);
        TbkTpwdCreateRequest req = new TbkTpwdCreateRequest();
        //req.setUserId("123");
        req.setText(text);
        req.setUrl(url);
        req.setLogo(logo);
        //req.setExt("{}");
        try {
            return client.execute(req);
        } catch (ApiException e) {
            e.printStackTrace();
            return null;
        }

    }
}
