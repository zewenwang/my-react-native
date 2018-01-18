package com.skeeter.myrn.router

import com.skeeter.myrn.activity.HelloActivity

/**
 *
 * @author  zewenwang created on 2018/1/17.
 */
object ReactRouter {
    private val mRouterTable = mapOf<Class<out Any>, String>(
        HelloActivity::class.java to "HelloWorld"
    )

    @JvmStatic
    fun getModuleName(clazz: Class<out Any>): String? = mRouterTable[clazz]

}
