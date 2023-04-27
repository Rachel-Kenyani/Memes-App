package com.cyanide.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeFive : AppCompatActivity() {
    lateinit var btnPrevFive: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_five)
        btnPrevFive=findViewById(R.id.btnPrevFive)
        btnPrevFive.setOnClickListener {
            val intent=Intent(this,MemeFour::class.java)
            startActivity(intent)
        }
    }
}

//class MemeFour : AppCompatActivity() {
//    lateinit var btnNextFour:Button
//    lateinit var btnPrevThree:Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_meme_four)
//        btnNextFour=findViewById(R.id.btnNextFour)
//        btnNextFour.setOnClickListener {
//            val intent=Intent(this,MemeFive::class.java)
//            startActivity(intent)
//        }
//        btnPrevThree=findViewById(R.id.btnPrevThree)
//        btnPrevThree.setOnClickListener {
//            val intent = Intent(this,MemeThree::class.java)
//            startActivity(intent)
//        }
//    }