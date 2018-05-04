package com.niles.owlapp.base;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.HashMap;

/**
 * Created by Negro
 * Date 2018/5/4
 * Email niulinguo@163.com
 */
public class MultipleItemModel implements MultiItemEntity {

    private final int mItemType;
    private HashMap<String, Object> mParams;

    public MultipleItemModel(int viewType) {
        mItemType = viewType;
    }

    public int getInteger(String key) {
        return get(key, 0);
    }

    public long getLong(String key) {
        return get(key, 0L);
    }

    public MultipleItemModel put(String key, Object value) {
        if (mParams == null) {
            mParams = new HashMap<>();
        }
        mParams.put(key, value);
        return this;
    }

    public <T> T get(String key, T defaultValue) {
        if (mParams != null && mParams.containsKey(key)) {
            //noinspection SingleStatementInBlock,unchecked
            return (T) mParams.get(key);
        }
        return defaultValue;
    }

    @Override
    public int getItemType() {
        return mItemType;
    }
}
