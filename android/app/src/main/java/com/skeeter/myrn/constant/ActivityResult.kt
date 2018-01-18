package com.skeeter.myrn.constant

import android.app.Activity

/**
 *
 * @author  zewenwang created on 2018/1/17.
 */

object ResultCode {
    const val RESULT_OK: Int = Activity.RESULT_OK
    const val RESULT_CANCELED: Int = Activity.RESULT_CANCELED
}

object RequestCode {
    /** 权限 0x10000 - 0x1ffff */
    const val REQ_CODE_PERMISSION_OVERLAY: Int = 0x10000

}
