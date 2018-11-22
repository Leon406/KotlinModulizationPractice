package me.leon.base.presenter

abstract class BasePresenter<V : IView> {
    lateinit var mView: V
}