package com.skeeter.myrn.util

import android.app.Fragment
import android.content.Context
import android.widget.Toast

/**
 *
 * @author  zewenwang created on 29/12/2017.
 */
object AppUtil {


}

fun Context.showToast(msg: String, len: Int = Toast.LENGTH_SHORT) {
    ToastHelper.showToast(this, msg, len)
}

fun Context.showToast(msgResId: Int, len: Int = Toast.LENGTH_SHORT) {
    ToastHelper.showToast(this, msgResId, len)
}

fun Fragment.showToast(msg: String, len: Int = Toast.LENGTH_SHORT) {
    ToastHelper.showToast(activity, msg, len)
}

fun Fragment.showToast(msgResId: Int, len: Int = Toast.LENGTH_SHORT) {
    ToastHelper.showToast(activity, msgResId, len)
}
