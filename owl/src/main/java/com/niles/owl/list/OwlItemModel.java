package com.niles.owl.list;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.HashMap;

/**
 * Created by Negro
 * Date 2018/5/4
 * Email niulinguo@163.com
 */
public class OwlItemModel implements MultiItemEntity {

    private final int mItemType;
    private final Class<? extends OwlBaseItemProvider> mProviderClass;
    private HashMap<String, Object> mParams;

    private OwlItemModel(Class<? extends OwlBaseItemProvider> providerClass) {
        mProviderClass = providerClass;
        mItemType = ViewTypeCreator.getId(providerClass);
    }

    public static OwlItemModel create(Class<? extends OwlBaseItemProvider> providerClass) {
        return new OwlItemModel(providerClass);
    }

    public int getInteger(String key) {
        return get(key, 0);
    }

    public long getLong(String key) {
        return get(key, 0L);
    }

    public String getString(String key) {
        return get(key, "");
    }

    public String[] getStringArray(String key) {
        return get(key, new String[]{});
    }

    public boolean getBoolean(String key) {
        return get(key, false);
    }

    public OwlItemModel put(String key, Object value) {
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
    public final int getItemType() {
        return mItemType;
    }

    public final Class<? extends OwlBaseItemProvider> getProviderClass() {
        return mProviderClass;
    }
}
