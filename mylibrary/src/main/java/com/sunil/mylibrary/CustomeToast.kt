package com.sunil.mylibrary

import android.content.Context
import android.widget.Toast

object CustomToast {
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}