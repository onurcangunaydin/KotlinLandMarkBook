package com.example.onurcan.kotlinlandmarkbook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var LandMarkNames = ArrayList<String>()
        LandMarkNames.add("Pisa")
        LandMarkNames.add("Colloesum")
        LandMarkNames.add("Eiffel")
        LandMarkNames.add("London Bridge")

        val colloseum = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.colloseum)
        val eiffel = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.eiffel)
        val londonbridge = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.londonbridge)
        val pisa = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.pisa)

        val landMarkImages = ArrayList<Bitmap>()

        landMarkImages.add(colloseum)
        landMarkImages.add(eiffel)
        landMarkImages.add(londonbridge)
        landMarkImages.add(pisa)


        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, LandMarkNames)

        listView.adapter = arrayAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(applicationContext, DetailActivity::class.java)
            intent.putExtra("name", LandMarkNames[i])

            val bitmap = landMarkImages [i]

            val chosen = Globals.Chosen
            chosen.chosenImage = bitmap


            startActivity(intent)


        }
    }
}
