package me.leon.usercenter.ui.activity

import me.leon.base.ext.io2Main
import me.leon.base.presenter.BasePresenter
import me.leon.usercenter.service.impl.UserServiceImpl

class RegisterPresenter : BasePresenter<RegisterView>() {
    fun doRegister(mobile: String, verifyCode: String, pwd: String) {
        val userService = UserServiceImpl()
        userService.register(mobile, verifyCode, pwd)
            .io2Main()
            .subscribe(
                {
                    mView.onRegister()
                },
                {
                    mView.onError(it)
                }
            )
    }
    fun doLogin(mobile: String,  pwd: String) {
        val userService = UserServiceImpl()
        userService.login(mobile,  pwd)
            .io2Main()
            .subscribe(
                {
                    mView.onRegister()
                },
                {
                    mView.onError(it)
                }
            )
    }
}