package com.example.acitivitylearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class NormalActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)
        initView()
    }

    private fun initView() {
        val btnExit : Button = findViewById<Button>(R.id.btnExit)
        btnExit.setOnClickListener(View.OnClickListener {
            finish()
            ActivityCollector.closeAll()
        })
    }
}