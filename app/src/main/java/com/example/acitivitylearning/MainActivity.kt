package com.example.acitivitylearning

import android.content.Intent
import android.net.Uri
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
            val intent = Intent(this,SecondActivity::class.java)
//            startActivity(intent)
            // Implicit Intent
//            val intent = Intent("com.example.activityLearning.START_ACTION")
//            startActivity(intent)
            // use implicit intent invoke system app
//            val intent = Intent()
//            intent.setAction(Intent.ACTION_CALL)
//            intent.setAction(Intent.ACTION_DIAL)
//            intent.setData(Uri.parse("tel:17804297287"))
//            intent.setAction("android.settings.SETTINGS")
            // pass data between activity
//            intent.putExtra("message_key", "Hello from MainActivity")
//            startActivity(intent)
            // get result back from activity
            startActivityForResult(intent,1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode.equals(1)) {
            when (resultCode) {
                RESULT_OK -> Toast.makeText(this, data?.getStringExtra("back_message"), Toast.LENGTH_LONG).show()
            }
        }
    }
}