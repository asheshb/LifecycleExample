package com.example.lifecycleexample

import timber.log.Timber

internal class ScreenAnimation(){
    private var animating = false

    fun onResume() {
        Timber.i("onResume called")
        if(animating){
            // resume animation
        }
    }

    fun onPause() {
        Timber.i("onPause called")
        if(animating){
            // pause animation
        }
    }

    fun startAnimation(){
        Timber.i("startAnimation called")
        animating = true
    }
}