package com.able.novel

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.multidex.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

class App : Application() {

    override fun onCreate() {
        super.onCreate()
//         必须在初始化ARouter之前配置
        if (BuildConfig.DEBUG) {
            // 日志开启     
            ARouter.openLog();
            // 调试模式开启，如果在install run模式下运行，则必须开启调试模式 
            ARouter.openDebug();
        }
        ARouter.init(this);

    }

    /**
     * 释放一些不必要的资源
     */
    override fun onLowMemory() {
        super.onLowMemory()
    }
}