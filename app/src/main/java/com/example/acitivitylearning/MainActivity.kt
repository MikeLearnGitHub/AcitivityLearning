package com.example.acitivitylearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "Add", Toast.LENGTH_LONG).show()
            R.id.remove_item -> Toast.makeText(this, "Remove", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun initView() {
        val nextButton: Button = findViewById(R.id.btnNext)
        nextButton.setOnClickListener {
//            Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show()
            // Explicit Intent
//            val intent = Intent(this,SecondActivity::class.java)
//            startActivity(intent)
            // Implicit Intent
            val intent = Intent("com.example.activityLearning.START_ACTION")
            startActivity(intent)
        }
    }
}