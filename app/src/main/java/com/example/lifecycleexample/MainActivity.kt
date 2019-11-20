package com.example.lifecycleexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val screenAnimation = ScreenAnimation(this.lifecycle)
        screenAnimation.startAnimation()

        //region
        start_animation.setOnClickListener{
            screenAnimation.startAnimation()
        }
        //endregion
    }
}
