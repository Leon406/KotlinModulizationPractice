package me.leon.usercenter.service

import io.reactivex.Flowable

interface UserService {
    fun register(mobile:String,verifyCode:String,pwd:String): Flowable<Boolean>
    fun login(mobile: String, pwd: String): Flowable<Boolean>
}