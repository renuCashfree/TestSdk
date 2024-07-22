package com.cashfree.coresdk

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object {
        @JvmStatic
        fun simpleToaster(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}