package com.example.lifecycleexample

import android.app.Application
import timber.log.Timber

class LifecycleExample: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}