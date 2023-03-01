//Auteur Silvana ESQUIVEL
//Création 01.03.2023
package com.example.busschedule

import android.app.Application
import com.example.busschedule.database.AppDatabase

class BusScheduleApplication : Application() {
    val database : AppDatabase by lazy {
        AppDatabase.getDatabase(this)
    }
}