package com.xe.demo.flagsdemo

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.TextView

/**
 * Created by 86188 on 2021/5/24.
 */
class MainActivity: AppCompatActivity() {
    var mTv: TextView? = null
    val SCHEME_HOST_HOME_PAGE = "homePage"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTv = findViewById(R.id.tv)
        var intent: Intent = getIntent()
        if (intent != null) {
            intent.action
//            var s = intent.getStringExtra("url")
            var uri: Uri? = intent?.data
            var s2: String = uri.toString();
            uri?.let {
                if (it.host == SCHEME_HOST_HOME_PAGE) {
                    val s: String = it.getQueryParameter("type")
                    if (!TextUtils.isEmpty(s2)) {
                        mTv!!.setText(s2)
                    } else {
                        mTv!!.setText("url == null")
                    }
                }

            }

        }
    }

    fun onClick(v: View) {
        if (v.id == R.id.btn_flag_activity_clear_task) {
            var intent: Intent = Intent(this,FlagActivityClearTopActivity::class.java)
            startActivity(intent)
        } else if (v.id == R.id.btn_flag_activity_new_task) {
            var intent: Intent = Intent(this,FlagActivityNewTaskActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        } else if (v.id == R.id.btn_flag_activity_single_top) {
            var intent: Intent = Intent(this,FlagActivitySingleTopActivity::class.java)
            startActivity(intent)
        } else if (v.id == R.id.btn_flag_activity_reorder_to_front) {
            var intent: Intent = Intent(this,FlagActivityReorderToFrontActivity::class.java)
            startActivity(intent)
        }
    }
}