package com.xe.demo.flagsdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class FlagActivityClearTopActivity : AppCompatActivity() {
    var TAG: String = "Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag_clear_top)
        Log.d(TAG,"----------FlagActivityClearTopActivity---onCreate")
    }

    fun startTwoFlagActivityClearTopActivity() {
        var intent: Intent = Intent(this,TwoFlagActivityClearTopActivity::class.java)
        startActivity(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG,"----------FlagActivityClearTopActivity---onNewIntent")
    }

    fun onClick(v: View) {
        startTwoFlagActivityClearTopActivity()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"----------FlagActivityClearTopActivity---onDestroy")
    }
}
