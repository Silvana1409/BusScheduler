//Auteur Silvana ESQUIVEL
//Création 01.03.2023
package com.example.busschedule.database.schedule

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Schedule {
    data class Schedule(
        @PrimaryKey val id: Int,
        @NonNull @ColumnInfo(name = "stop_name") val stopName: String,
        @NonNull @ColumnInfo(name = "arrival_time") val arrivalTime: Int
    )
}