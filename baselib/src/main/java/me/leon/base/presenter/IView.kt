package me.leon.base.presenter

interface IView {
    fun showLoading()
    fun hideLoading()
    fun onError(err: Throwable)
}