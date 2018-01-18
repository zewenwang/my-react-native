package com.skeeter.myrn.util

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.text.TextUtils
import android.view.Gravity
import android.widget.Toast

/**
 * modified by zewenwang on 2017/03/06
 */
object ToastHelper {
    private var oldMsg: String? = null
    private var toast: Toast? = null

    fun showToast(context: Context?, msg: String) {
        if (context == null) {
            return
        }
        showToast(context, msg, Toast.LENGTH_SHORT)
    }

    fun showToast(context: Context?, resId: Int) {
        if (context == null) {
            return
        }
        showToast(context, context.getString(resId), Toast.LENGTH_SHORT)
    }

    fun showToast(context: Context?, resId: Int, len: Int) {
        if (context == null) {
            return
        }
        showToast(context, context.getString(resId), len)
    }

    fun showToast(context: Context?, msg: String, len: Int) {
        if (context == null) {
            return
        }
        if (TextUtils.isEmpty(msg)) {
            return
        }

        val appContext = context.applicationContext
        Handler(Looper.getMainLooper()).post {
            if (toast == null || !TextUtils.equals(msg, oldMsg)) {
                if (toast != null) {
                    toast!!.cancel()
                }
                toast = Toast.makeText(appContext, msg, len)
//                val view = LayoutInflater.from(appContext).inflate(R.layout.toast_middle, null)
//                val tvMsg = view.findViewById(R.id.toast_middle_tv) as TextView
//                tvMsg.text = msg
//                toast!!.view = view
                toast!!.setGravity(Gravity.CENTER, 0, 0)
            }
            oldMsg = msg
            toast!!.show()
        }
    }

}
