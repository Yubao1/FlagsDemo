package com.xe.demo.flagsdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class FlagActivitySingleTopActivity : AppCompatActivity() {
    var TAG: String = "Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag_single_top)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG,"-------FlagActivitySingleTopActivity---onNewIntent")
    }

    fun onClick(v: View) {
        var intent: Intent = Intent(this,FlagActivitySingleTopActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }
}
