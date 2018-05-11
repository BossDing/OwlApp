package com.niles.owlapp;

import android.app.Application;
import android.content.Context;

import com.niles.owl.OwlApp;
import com.squareup.leakcanary.AndroidExcludedRefs;
import com.squareup.leakcanary.DisplayLeakService;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by Negro
 * Date 2018/4/26
 * Email niulinguo@163.com
 */
public class MyApplication extends Application {

    private RefWatcher mRefWatcher;

    public static RefWatcher getRefWatcher(Context context) {
        return ((MyApplication) context.getApplicationContext()).mRefWatcher;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }

        mRefWatcher = LeakCanary
                .refWatcher(this)
                .listenerServiceClass(DisplayLeakService.class)
                .excludedRefs(AndroidExcludedRefs.createAndroidDefaults().build())
                .buildAndInstall();

        OwlApp.init(BuildConfig.DEBUG, this);
    }
}
