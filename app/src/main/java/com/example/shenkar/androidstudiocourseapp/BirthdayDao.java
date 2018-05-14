package com.example.shenkar.androidstudiocourseapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;
@Dao
public interface BirthdayDao {

    @Query("SELECT * FROM birthdays")
    List<BirthDayInstance> getAllBirthdays();

    @Insert
    void insertAll(BirthDayInstance birthDayInstances);
}
