package com.scliang.iui.base;

import androidx.multidex.MultiDexApplication;

import com.scliang.iui.BuildConfig;
import com.scliang.iui.utils.LogUtils;

public abstract class BaseApplication extends MultiDexApplication {
    public static final class BasicApplication extends BaseApplication { }

    public static BaseApplication instance() { return ins; }

    public BaseApplication() { ins = this; }

    @Override
    public final void onCreate() {
        super.onCreate();
        LogUtils.init(BuildConfig.BUILD_TYPE);
        onCreateHere();
    }

    public void onCreateHere() {
    }

    private static BaseApplication ins;
}
