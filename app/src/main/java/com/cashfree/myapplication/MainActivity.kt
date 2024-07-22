package com.cashfree.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cashfree.coresdk.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toaster.simpleToaster(this,"test msg")
    }
}