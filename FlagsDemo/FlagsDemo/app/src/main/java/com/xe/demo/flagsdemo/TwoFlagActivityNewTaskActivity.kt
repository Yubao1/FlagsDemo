package com.xe.demo.flagsdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView

/**
 * Created by 86188 on 2021/5/28.
 */
class TwoFlagActivityNewTaskActivity: AppCompatActivity(){
    var TAG: String = "Activity"
    var mTv: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_flag_new_task)
        mTv =  findViewById(R.id.tv2);
        mTv!!.setText("taskId = " + getTaskId())
        Log.d(TAG, "TwoFlagActivityNewTaskActivity---app的taskId = " + getTaskId());
    }
}