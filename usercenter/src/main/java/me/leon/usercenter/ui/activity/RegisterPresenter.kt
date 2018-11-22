package me.leon.usercenter.ui.activity

import android.widget.Toast
import me.leon.base.presenter.BasePresenter

class RegisterPresenter : BasePresenter<RegisterView>() {
    fun doRegister(mobile:String,verifyCode:String) {
        mView.onRegister()
    }
}