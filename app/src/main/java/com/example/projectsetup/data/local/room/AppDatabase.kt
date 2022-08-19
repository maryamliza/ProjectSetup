package com.example.projectsetup.data.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        // Product::class,
        // User::class,
    ],
    version = AppDatabase.DATABASE_VERSION,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    /** DAO Section here */
//    abstract fun productDao(): ProductDao()
//    abstract fun userDao(): UserDao()

    companion object {
        private var INSTANCE: AppDatabase? = null
        private const val DATABASE_NAME = "algo_bd.db" // TODO: Change dbName.db here
        const val DATABASE_VERSION = 1

        fun getInstance(context: Context): AppDatabase {
            synchronized(AppDatabase::class) {
                return INSTANCE ?: buildRoom(context)
            }
        }

        private fun buildRoom(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            DATABASE_NAME
        ).build()
    }
}