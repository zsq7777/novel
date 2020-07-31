package com.able.novel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.able.auth.AuthSignActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun test(view: View) {
        startActivity(Intent(this,AuthSignActivity::class.java))
//        ARouter.getInstance().build("/auth/AuthSignActivity").navigation()
    }
}
