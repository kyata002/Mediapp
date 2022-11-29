package com.example.mediapp.view.activity

import android.content.Context
import android.content.Intent
import com.example.mediapp.OnActionCallback
import com.example.mediapp.R
import com.example.mediapp.base.BaseActivity
import com.example.mediapp.view.dialog.RecomentDialog
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity(override val layoutId: Int = R.layout.activity_setting) :BaseActivity() {
    override fun initView() {


    }

    override fun addEvent() {
        eventClick()
    }

    private fun eventClick() {
        bt_back_setting.setOnClickListener {
            onBackPressed()
            finish()
        }
        bt_profile.setOnClickListener {
            ProfileActivity.start(this)
        }
//        bt_feedback.setOnClickListener {
//
//        }
//        bt_recomment.setOnClickListener {
//            RecomentDialog.start(this, object : OnActionCallback {
//                override fun callback(key: String?, vararg data: Any?) {
//                    when {
//                        key.equals("delete") -> {
//
//                        }
//                        key.equals("cancel") -> {
//
//                        }
//                    }
//                }
//            })
//        }
        bt_policy.setOnClickListener {
            PolicyActvity.start(this)
        }
    }

    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, SettingActivity::class.java)
            context.startActivity(starter)
        }
    }
}