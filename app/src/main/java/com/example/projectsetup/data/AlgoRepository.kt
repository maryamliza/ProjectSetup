package com.example.projectsetup.data

import com.example.projectsetup.data.local.LocalDataSource
import com.example.projectsetup.data.remote.RemoteDataSource

class AlgoRepository (
    val remote: RemoteDataSource,
    val local: LocalDataSource,
        ) {
}