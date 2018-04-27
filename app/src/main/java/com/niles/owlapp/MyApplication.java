package com.niles.owlapp;

import android.app.Application;

import com.niles.owl.OwlApp;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Negro
 * Date 2018/4/26
 * Email niulinguo@163.com
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }

        LeakCanary.install(this);
        OwlApp.init(BuildConfig.DEBUG, this);
    }
}
