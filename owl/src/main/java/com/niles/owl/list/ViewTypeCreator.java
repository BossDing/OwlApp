package com.niles.owl.list;

import android.support.annotation.NonNull;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Negro
 * Date 2018/5/11
 * Email niulinguo@163.com
 */
public final class ViewTypeCreator {

    private static final HashMap<Class, Integer> mIdMap = new HashMap<>();
    private static final AtomicInteger mIdGenerator = new AtomicInteger(0);

    private ViewTypeCreator() {
    }

    static int getId(@NonNull Class<? extends OwlBaseItemProvider> clazz) {
        if (mIdMap.containsKey(clazz)) {
            return mIdMap.get(clazz);
        }
        final int id = mIdGenerator.getAndIncrement();
        mIdMap.put(clazz, id);
        return id;
    }

}
