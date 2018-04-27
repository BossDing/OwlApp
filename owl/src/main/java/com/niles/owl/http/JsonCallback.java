package com.niles.owl.http;

import com.alibaba.fastjson.JSONObject;
import com.lzy.okgo.callback.AbsCallback;

/**
 * Created by Negro
 * Date 2018/4/26
 * Email niulinguo@163.com
 */
public abstract class JsonCallback extends AbsCallback<JSONObject> {

    private final JsonConvert mConvert;

    public JsonCallback() {
        mConvert = new JsonConvert();
    }

    @Override
    public JSONObject convertResponse(okhttp3.Response response) throws Throwable {
        final JSONObject jsonObject = mConvert.convertResponse(response);
        response.close();
        return jsonObject;
    }
}
