package com.initishbhatt.marvelsuperheros.characters

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import com.initishbhatt.marvelsuperheros.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

}
