package com.example.onurcan.kotlinlandmarkbook

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = intent
        val name = intent.getStringExtra("name")
        textView.text = name

        val chosen = Globals.Chosen
        val selectedImage = chosen.returnImage()
        imageView.setImageBitmap(selectedImage)
    }
}
