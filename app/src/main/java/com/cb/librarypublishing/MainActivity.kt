package com.cb.librarypublishing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cb.ui.Logger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.debug("")
    }
}