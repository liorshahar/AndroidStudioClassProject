package com.example.shenkar.androidstudiocourseapp;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {BirthDayInstance.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract BirthdayDao birthdayDao();
}
