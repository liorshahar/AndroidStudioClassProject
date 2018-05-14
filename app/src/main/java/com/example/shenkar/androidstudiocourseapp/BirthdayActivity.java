package com.example.shenkar.androidstudiocourseapp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.migration.Migration;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BirthdayActivity extends AppCompatActivity {


    FloatingActionButton fab;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    List<BirthDayInstance> birthDayInstances ;




    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(AppSettings.TAG , "onCreate: BirthdayActivity");
        setContentView(R.layout.activity_birthday);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birthDayInstances = MainActivity.appDataBase.birthdayDao().getAllBirthdays();
               startActivity(new Intent(BirthdayActivity.this , CreateBirthDayActivity.class));
            }
        });
        init();
    }

    public void init(){

        birthDayInstances = MainActivity.appDataBase.birthdayDao().getAllBirthdays();
        recyclerView = findViewById(R.id.birthday_activity_recycler_view);
        adapter = new BirthDayActivityRecycleView(this , birthDayInstances );
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        birthDayInstances = MainActivity.appDataBase.birthdayDao().getAllBirthdays();
    }
}
