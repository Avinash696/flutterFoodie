package com.example.intenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent

        val receiveData = intent.getStringArrayListExtra("myData")
        val receiveAmount = intent.getIntegerArrayListExtra("myDataAmount")
        Log.d("fam", "onCreate:${receiveData} $receiveAmount")

    }
}