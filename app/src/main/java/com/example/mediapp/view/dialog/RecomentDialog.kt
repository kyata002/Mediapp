package com.example.mediapp.view.dialog

import android.content.Context
import android.content.Intent
import com.example.mediapp.OnActionCallback
import com.example.mediapp.R
import com.example.mediapp.base.BaseActivity
import kotlinx.android.synthetic.main.dialog_recomment.*
import java.io.File

class RecomentDialog(override val layoutId: Int = R.layout.dialog_recomment) :BaseActivity() {
    companion object {
        var callback: OnActionCallback? = null
        fun start(context: Context, onActionCallback: OnActionCallback) {
            callback = onActionCallback
            context.startActivity(Intent(context, RecomentDialog::class.java))
        }
    }
    override fun initView() {
        border_delete.setOnClickListener {
            finish()
        }
        border_delete_dialog.setOnClickListener {

        }

    }

    override fun addEvent() {
        bt_delete.setOnClickListener {
            finish()
        }

        bt_cancel.setOnClickListener {
            finish()
        }
    }
}