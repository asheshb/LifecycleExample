package com.example.lifecycleexample

import timber.log.Timber

internal class ScreenAnimation(){
    private var animating = false

    fun onResume() {
        Timber.i("onResume called")
        if(animating){
            //start animation
        }
    }

    fun onPause() {
        Timber.i("onPause called")
        if(animating){
            //stop animation
        }
    }

    fun startAnimation(){
        Timber.i("startAnimation called")
        animating = true
    }
}