package com.niles.owl.http;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lzy.okgo.convert.Converter;

import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by Negro
 * Date 2018/4/26
 * Email niulinguo@163.com
 */
public final class JsonConvert implements Converter<JSONObject> {
    @Override
    public JSONObject convertResponse(Response response) throws Throwable {
        ResponseBody body = response.body();
        if (body == null) return null;
        final String string = body.string();
        if (TextUtils.isEmpty(string)) return null;
        return JSON.parseObject(string);
    }
}
