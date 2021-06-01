package com.xe.demo.flagsdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TwoFlagActivityReorderToFrontActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_flag_reorder_to_front)
    }

    fun onClick(v: View) {
        var intent: Intent = Intent(this,FlagActivityReorderToFrontActivity::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
        startActivity(intent)
    }
}
