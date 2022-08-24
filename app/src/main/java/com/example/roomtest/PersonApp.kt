package com.example.roomtest

import android.app.Application
import androidx.room.Room

class PersonApp: Application() {

    val room = Room.databaseBuilder(this, PeopleDb::class.java, "person").build()
}