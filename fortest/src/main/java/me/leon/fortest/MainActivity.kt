package me.leon.fortest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import me.ele.uetool.UETool

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        UETool.showUETMenu();
        setContentView(R.layout.activity_main)
    }
}
