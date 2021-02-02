package com.lldm.libtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lldm.debuglib.DebugUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DebugUtil.d("Hola", "This a message for debug.")
    }
}