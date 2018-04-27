package com.niles.owl;

import android.app.Application;
import android.support.annotation.NonNull;

import com.blankj.utilcode.util.Utils;
import com.niles.owl.http.OkHttpInitializer;

import me.yokeyword.fragmentation.Fragmentation;
import me.yokeyword.fragmentation.helper.ExceptionHandler;
import timber.log.Timber;

/**
 * Created by Negro
 * Date 2018/4/26
 * Email niulinguo@163.com
 */
public final class OwlApp {

    private static final String TAG = OwlApp.class.getSimpleName();

    private static Application sApp;
    private static boolean sDebug;

    public static void init(boolean debug, @NonNull Application application) {
        sApp = application;
        sDebug = debug;

        if (isDebug()) {
            initLogcat();
        }
        initUtils();
        initFragment();
        initHttp();
    }

    @NonNull
    public static Application app() {
        if (sApp == null) {
            throw new RuntimeException("please init first");
        }
        return sApp;
    }

    public static boolean isDebug() {
        return sDebug;
    }

    private static void initLogcat() {
        Timber.plant(new Timber.DebugTree());
    }

    private static void initUtils() {
        Utils.init(app());
    }

    private static void initFragment() {
        Fragmentation.builder()
                .stackViewMode(Fragmentation.BUBBLE)
                .debug(isDebug())
                .handleException(new ExceptionHandler() {
                    @Override
                    public void onException(@NonNull Exception e) {
                        Timber.tag(TAG).e(e);
                    }
                })
                .install();
    }

    private static void initHttp() {
        OkHttpInitializer.init(app());
    }
}
