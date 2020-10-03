package com.hm.iou.lifecycle.demo;

import android.content.Context;
import android.util.Log;

import com.hm.iou.lifecycle.annotation.AppLifecycle;
import com.hm.lifecycle.api.IApplicationLifecycleCallbacks;

/**
 * Created by hjy on 2018/10/23.
 */
@AppLifecycle
public class ModuleBApplicationLifecycleCallbacks implements IApplicationLifecycleCallbacks {

    @Override
    public int getPriority() {
        return NORM_PRIORITY;
    }

    @Override
    public void onCreate(Context context) {
        Log.d("AppLike", "onCreate(): this is in ModuleBAppLike.");
    }

    @Override
    public void onTerminate() {
        Log.d("AppLike", "onTerminate(): this is in ModuleBAppLike.");
    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
