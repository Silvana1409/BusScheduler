//Auteur Silvana ESQUIVEL
//Création 01.03.2023
package com.example.busschedule.database
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.busschedule.database.schedule.ScheduleDao

abstract class AppDatabase:RoomDatabase() {
    abstract fun ScheduleDao() : ScheduleDao

    companion object{
        @Volatile
        private var INSTANCE : AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "app_database")
                    .createFromAsset("database/bus_schedule.db")
                    .build()
                INSTANCE = instance

                instance
            }
        }

    }
}