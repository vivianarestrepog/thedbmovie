package com.demo.thedbmovie

import android.app.Activity
import android.os.Bundle
import com.demo.thedbmovie.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
    }


}