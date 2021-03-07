package com.example.acitivitylearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
//        val intent = getIntent()
//        val data = intent.getStringExtra("message_key")
//        Toast.makeText(this, data, Toast.LENGTH_LONG).show()
        initView()
    }

    private fun initView() {
        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent()
            intent.putExtra("back_message", "Hello from second activity")
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}