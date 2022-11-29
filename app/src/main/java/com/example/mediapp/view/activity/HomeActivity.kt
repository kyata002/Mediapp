package com.example.mediapp.view.activity

import android.content.Context
import android.content.Intent
import com.example.mediapp.R
import com.example.mediapp.base.BaseActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity(override val layoutId: Int = R.layout.activity_home) :BaseActivity() {
    override fun initView() {

    }

    override fun addEvent() {
        bt_setting_home.setOnClickListener {
            SettingActivity.start(this);
        }
    }
    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, HomeActivity::class.java)
            context.startActivity(starter)
        }
    }

}