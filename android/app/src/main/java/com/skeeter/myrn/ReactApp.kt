package com.skeeter.myrn

import android.app.Application
import com.facebook.react.ReactInstanceManager
import com.facebook.react.common.LifecycleState
import com.facebook.react.shell.MainReactPackage

/**
 *
 * @author  zewenwang created on 2018/1/17.
 */
class ReactApp : Application() {

    companion object {
        lateinit var sInstance: ReactApp
            private set
    }

    init {
        sInstance = this
    }

    override fun onCreate() {
        super.onCreate()
//        SoLoader.init(this, false)
    }

    val mReactInstanceMgr: ReactInstanceManager by lazy {
        ReactInstanceManager.builder()
            .setApplication(this)
            .setBundleAssetName("index.android.bundle")
            .setJSMainModulePath("index")
            .addPackage(MainReactPackage())
            .setUseDeveloperSupport(BuildConfig.DEBUG)
            .setInitialLifecycleState(LifecycleState.RESUMED)
            .build()
    }

//    override fun getReactNativeHost(): ReactNativeHost {
//
//    }

}
