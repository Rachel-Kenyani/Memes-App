package com.cyanide.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeTwo : AppCompatActivity() {
    lateinit var btnNextTwo: Button
    lateinit var btnPrev:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_two)
        btnNextTwo=findViewById(R.id.btnNextTwo)
        btnNextTwo.setOnClickListener {
            val intent=Intent(this,MemeThree::class.java)
            startActivity(intent)
        }
        btnPrev=findViewById(R.id.btnPrev)
        btnPrev.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}

//class MainActivity : AppCompatActivity() {
//    lateinit var btnNext:Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        btnNext=findViewById(R.id.btnNext)
//        btnNext.setOnClickListener {
//            val intent=Intent(this,MemeTwo::class.java)
//            startActivity(intent)
//        }
//    }
//}