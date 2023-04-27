package com.cyanide.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeThree : AppCompatActivity() {
    lateinit var btnNextThree: Button
    lateinit var btnPrevTwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_three)
        btnNextThree=findViewById(R.id.btnNextThree)
        btnNextThree.setOnClickListener {
           val intent=Intent(this,MemeFour::class.java)
           startActivity(intent)
        }
        btnPrevTwo=findViewById(R.id.btnPrevTwo)
        btnPrevTwo.setOnClickListener {
            val intent = Intent(this, MemeTwo::class.java)
            startActivity(intent)
        }
    }
}

// lateinit var btnNextTwo: Button
//    lateinit var btnPrev:Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_meme_two)
//        btnNextTwo=findViewById(R.id.btnNextTwo)
//        btnNextTwo.setOnClickListener {
//            val intent=Intent(this,MemeTwo::class.java)
//            startActivity(intent)
//        }
//        btnPrev=findViewById(R.id.btnPrev)
//        btnPrev.setOnClickListener {
//            val intent=Intent(this,MainActivity::class.java)
//            startActivity(intent)