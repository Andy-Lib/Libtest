package com.lldm.debuglib

import android.util.Log

object DebugUtil {
    fun d(tag: String, msg: String) {
        Log.d(tag, msg)
    }

    fun i(tag: String, msg: String) {
        Log.i(tag, msg)
    }
}