package me.leon.usercenter.service.impl

import io.reactivex.Flowable
import me.leon.usercenter.service.UserService

class UserServiceImpl:UserService {
    override fun login(mobile: String, pwd: String): Flowable<Boolean> {
        return Flowable.just(true)
    }

    override fun register(mobile: String, verifyCode: String, pwd: String): Flowable<Boolean> {
        return Flowable.just(true)
    }
}