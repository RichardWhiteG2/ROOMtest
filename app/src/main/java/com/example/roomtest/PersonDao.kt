package com.example.roomtest

import androidx.room.*

@Dao
interface PersonDao {
    @Query("Select * from person")
    fun getAll(): List<Person>

    @Query("Select * from Person where id= :id")
    fun getById(id: Int): Person

    @Update
    fun update(person: Person)

    @Insert
    fun insert(people: List<Person>)

    @Delete
    fun delete(person: Person)
}