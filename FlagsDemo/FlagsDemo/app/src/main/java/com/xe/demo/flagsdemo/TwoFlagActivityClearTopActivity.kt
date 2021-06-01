package com.xe.demo.flagsdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class TwoFlagActivityClearTopActivity : AppCompatActivity() {
    var TAG: String = "Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_flag_clear_top)
    }

    fun onClick(v: View) {
        if (v.id == R.id.btn_flag_activity_clear_top) {
            var intent: Intent = Intent(this, FlagActivityClearTopActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        } else if (v.id == R.id.btn_flag_activity_clear_top_and_flag_activity_single_top) {
            var intent: Intent = Intent(this, FlagActivityClearTopActivity::class.java)
            var flag: Int = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            intent.setFlags(flag)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"----------TwoFlagActivityClearTopActivity---onDestroy")
    }
}
