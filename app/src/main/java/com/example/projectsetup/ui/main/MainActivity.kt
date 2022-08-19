package com.example.projectsetup.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectsetup.databinding.ActivityMainBinding
import com.example.projectsetup.di.repositoryModule
import com.example.projectsetup.di.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}