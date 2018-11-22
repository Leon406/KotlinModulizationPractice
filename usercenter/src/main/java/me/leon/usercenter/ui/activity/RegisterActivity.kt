package me.leon.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_user.*
import me.leon.base.ui.activity.MvpActivity
import me.leon.usercenter.R

class RegisterActivity : MvpActivity<RegisterPresenter>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        val presenter = RegisterPresenter()
        presenter.mView = this

        btnVerify.setOnClickListener {
            presenter.doRegister("11111","5555","1111111")

        }
    }
    override fun onRegister() {
        Toast.makeText(this, "onRegister", Toast.LENGTH_SHORT).show()
    }

}
