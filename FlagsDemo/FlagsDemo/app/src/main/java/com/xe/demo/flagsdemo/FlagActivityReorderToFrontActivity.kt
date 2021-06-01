package com.xe.demo.flagsdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class FlagActivityReorderToFrontActivity : AppCompatActivity() {
    var TAG:String = "Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag_reorder_to_front)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG,"-------FlagActivityReorderToFrontActivity---onNewIntent")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"-------FlagActivityReorderToFrontActivity---onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"-------FlagActivityReorderToFrontActivity---onDestroy")
    }

    fun onClick(v: View) {
        var intent: Intent = Intent(this,TwoFlagActivityReorderToFrontActivity::class.java)
        startActivity(intent)
    }
}
