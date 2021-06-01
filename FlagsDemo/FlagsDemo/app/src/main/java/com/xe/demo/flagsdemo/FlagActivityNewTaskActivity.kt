package com.xe.demo.flagsdemo

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import org.greenrobot.eventbus.EventBus

class FlagActivityNewTaskActivity : AppCompatActivity() {
    var TAG: String = "Activity"
    var mTv:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag_new_task)
        mTv = findViewById(R.id.tv);
        mTv!!.setText("taskId = " + getTaskId())
        Log.d(TAG, "app的taskId = " + getTaskId());
    }

    fun onClick(v: View) {
        var  intent: Intent = Intent(this, TwoFlagActivityNewTaskActivity::class.java);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent)
    }
}
