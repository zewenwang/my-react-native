package com.skeeter.myrn.activity

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.skeeter.myrn.R
import com.skeeter.myrn.constant.RequestCode
import com.skeeter.myrn.util.showToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** 检查悬浮窗权限 */
    fun requireOverlays() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M
            || Settings.canDrawOverlays(this)) {
            return
        }

        val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + packageName))
        startActivityForResult(intent, RequestCode.REQ_CODE_PERMISSION_OVERLAY)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == RequestCode.REQ_CODE_PERMISSION_OVERLAY) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && !Settings.canDrawOverlays(this)) {
                showToast("没有悬浮窗权限")
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

    fun onTvHelloClicked(view: View) {
        startActivity(Intent(this, HelloActivity::class.java))
    }
}
