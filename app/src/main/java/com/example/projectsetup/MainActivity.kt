package com.example.projectsetup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectsetup.di.repositoryModule
import com.example.projectsetup.di.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}