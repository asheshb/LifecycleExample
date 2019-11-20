package com.example.lifecycleexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var screenAnimation: ScreenAnimation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        screenAnimation = ScreenAnimation()
        screenAnimation.startAnimation()

    }

    override fun onPause() {
        super.onPause()

        screenAnimation.onPause()
    }

    override fun onResume() {
        super.onResume()

        screenAnimation.onResume()
    }
}
