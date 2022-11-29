package com.example.mediapp.view.activity

import android.content.Context
import android.content.Intent
import com.example.mediapp.R
import com.example.mediapp.base.BaseActivity
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity(override val layoutId: Int = R.layout.activity_profile) :BaseActivity() {
    override fun initView() {

    }

    override fun addEvent() {
        bt_back_profile.setOnClickListener {
            onBackPressed()
            finish()
        }
    }
    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, ProfileActivity::class.java)
            context.startActivity(starter)
        }
    }

}