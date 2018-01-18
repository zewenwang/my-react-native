package com.skeeter.myrn.activity

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 *
 * @author  zewenwang created on 2018/1/17.
 */
abstract class BaseActivity : AppCompatActivity() {

    protected val TAG: String = javaClass.simpleName

    protected val mContentView: ViewGroup by lazy {
        window.decorView.findViewById(android.R.id.content) as ViewGroup
    }

    /**
     * 初始化View
     * */
    abstract fun initView()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!isTaskRoot && MainActivity::class.java == javaClass) {
            // fix  应用程序安装完后直接打开，按home键退出后，再次打开程序时应用重新启动的 bug
            Log.e(TAG, this.toString() + " BaseActivity !isTaskRoot() is true do finish")
            finish()
            return
        }

    }

    override fun setContentView(@LayoutRes layoutResID: Int) {
        setContentView(LayoutInflater.from(this).inflate(layoutResID, null))
    }

    override fun setContentView(view: View) {
        setContentView(view, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT))
    }

    override fun setContentView(view: View, params: ViewGroup.LayoutParams) {
        super.setContentView(view, params)
        initView()
    }

    protected open fun getContentView(): ViewGroup = mContentView


}
