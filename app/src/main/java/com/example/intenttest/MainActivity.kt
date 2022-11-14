package com.example.intenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrAmount = ArrayList<Int>()
        arrAmount.add(2)
        arrAmount.add(1)
        arrAmount.add(4)
        val arr = ArrayList<String>()
        arr.add("Avi")
        arr.add("nitin")
        arr.add("anju")
        arr.add("bro")


        btn = findViewById(R.id.btnMain1)


        btn.setOnClickListener {
            val intent =  Intent(this,MainActivity2::class.java)
            intent.putExtra("myData",arr)
            intent.putExtra("myDataAmount",arrAmount)
            startActivity(intent)
        }
    }
}