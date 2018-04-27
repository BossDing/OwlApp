package com.niles.owl.http;

import com.alibaba.fastjson.JSONObject;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.BitmapCallback;

/**
 * Created by Negro
 * Date 2018/4/26
 * Email niulinguo@163.com
 */
public final class OkGoDemo {

    private OkGoDemo() {}

    public static void post() {
        OkGo.<JSONObject>post("http://www.baidu.com")
                .execute(new BitmapCallback());
    }

}
