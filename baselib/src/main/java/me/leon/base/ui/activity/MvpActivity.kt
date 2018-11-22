package me.leon.base.ui.activity

import me.leon.base.presenter.BasePresenter
import me.leon.base.presenter.IView

open class MvpActivity<P : BasePresenter<*>> : BaseActivity(), IView {
    lateinit var mPresenter: P
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onErroe(err: Throwable) {
    }

}