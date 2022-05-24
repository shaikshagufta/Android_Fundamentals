package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showToast(view: View) {
      Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }
    fun countUp(view: View) {
        mCount++
        val mShowCount = findViewById<TextView>(R.id.show_count)
        mShowCount.text = mCount.toString()
    }
}