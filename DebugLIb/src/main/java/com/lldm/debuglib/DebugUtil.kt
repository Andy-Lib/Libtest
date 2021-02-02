package com.lldm.debuglib

import android.util.Log
import com.sunmi.pay.hardware.aidlv2.system.BasicOptV2

object DebugUtil {
    fun d(tag: String, msg: String) {
        Log.d(tag, msg)
    }

    fun i(tag: String, msg: String) {
        Log.i(tag, msg)
    }
}