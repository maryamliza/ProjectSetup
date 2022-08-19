package com.example.projectsetup.di

import com.example.projectsetup.data.AlgoRepository
import com.example.projectsetup.data.local.room.AppDatabase
import com.example.projectsetup.data.local.LocalDataSource
import com.example.projectsetup.data.remote.RemoteDataSource
import com.example.projectsetup.data.remote.retrofit.RetrofitManager
import com.example.projectsetup.data.remote.retrofit.ServiceAPI
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val repositoryModule = module {

    single { AlgoRepository(get(), get()) }

    single { RemoteDataSource(get()) }
    single<ServiceAPI> { RetrofitManager.getService() }

    single { LocalDataSource(get()) }
    single<AppDatabase> { AppDatabase.getInstance(androidContext()) }

}

val viewModelsModule = module {
    // Aqui iran lo viewmodels usando viewModel { SomeViewModel(get())}
}
