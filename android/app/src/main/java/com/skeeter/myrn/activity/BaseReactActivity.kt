package com.skeeter.myrn.activity

import android.os.Bundle
import com.facebook.react.ReactInstanceManager
import com.facebook.react.ReactRootView
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
import com.skeeter.myrn.ReactApp
import com.skeeter.myrn.router.ReactRouter

/**
 *
 * @author  zewenwang created on 2018/1/17.
 */
abstract class BaseReactActivity : BaseActivity(), DefaultHardwareBackBtnHandler {

    protected val mReactRootView: ReactRootView by lazy { ReactRootView(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mReactRootView.startReactApplication(ReactApp.sInstance.mReactInstanceMgr, getModuleName(), null)
        setContentView(mReactRootView)
    }

    override fun initView() {}

    protected fun getModuleName(): String? = ReactRouter.getModuleName(javaClass)

    fun getReactInstanceMgr(): ReactInstanceManager = ReactApp.sInstance.mReactInstanceMgr

    override fun invokeDefaultOnBackPressed() {
        super.onBackPressed()
    }


    override fun onResume() {
        super.onResume()
        getReactInstanceMgr().onHostResume(this, this)
    }

    override fun onPause() {
        super.onPause()
        getReactInstanceMgr().onHostPause(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        getReactInstanceMgr().onHostDestroy(this)
    }

    override fun onBackPressed() {
        getReactInstanceMgr().onBackPressed()
    }
}
