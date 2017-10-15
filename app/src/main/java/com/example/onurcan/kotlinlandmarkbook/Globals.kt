package com.example.onurcan.kotlinlandmarkbook

import android.graphics.Bitmap

/**
 * Created by onurcan on 14.10.2017.
 */

class Globals {

    companion object Chosen {
        var chosenImage: Bitmap? = null
        fun returnImage(): Bitmap {
            return chosenImage!!
        }
    }


}