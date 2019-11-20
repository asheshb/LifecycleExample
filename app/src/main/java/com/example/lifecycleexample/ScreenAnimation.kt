package com.example.lifecycleexample

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import timber.log.Timber

internal class ScreenAnimation(private val lifecycle: Lifecycle): LifecycleObserver{
    private var animating = false
    init{
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Timber.i("onResume called")
        if(animating){
            // resume animation
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Timber.i("onPause called")
        if(animating){
            // pause animation
        }
    }

    fun startAnimation(){
        Timber.i("startAnimation called")
        animating = true
        if (lifecycle.currentState.isAtLeast(Lifecycle.State.RESUMED)) {
            Timber.i("startAnimation lifecycle is in resumed state")
            //code to show animation
        }
    }
}