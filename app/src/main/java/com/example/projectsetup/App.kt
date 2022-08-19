package com.example.projectsetup

import android.app.Application
import com.example.projectsetup.di.repositoryModule
import com.example.projectsetup.di.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(listOf(repositoryModule, viewModelsModule))
        }
    }
}