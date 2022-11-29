package com.example.mediapp.view.activity

import android.content.Context
import android.content.Intent
import com.example.mediapp.R
import com.example.mediapp.base.BaseActivity
import kotlinx.android.synthetic.main.acivity_policy.*

class PolicyActvity(override val layoutId: Int = R.layout.acivity_policy) :BaseActivity() {
    override fun initView() {

    }

    override fun addEvent() {
        bt_back_setting_policy.setOnClickListener {
            onBackPressed()
            finish()
        }
    }
    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, PolicyActvity::class.java)
            context.startActivity(starter)
        }
    }
}