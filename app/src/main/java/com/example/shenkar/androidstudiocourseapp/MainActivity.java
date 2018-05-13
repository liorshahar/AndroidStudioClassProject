package com.example.shenkar.androidstudiocourseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mainRecyclerView;
    private RecyclerView.Adapter adapter;
    private List<MainActivityListItem> btnNameList;
    private MainAppBtnPressred mainAppBtnPressred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppSettings.TAG , "onCreate: MainActivity");
        init();
    }

    private void init(){

        mainRecyclerView = findViewById(R.id.main_activity_recycler_view);
        mainRecyclerView.setHasFixedSize(true);
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        btnNameList = new ArrayList<>();
        mainAppBtnPressred = new MainAppBtnPressred(this);

        /*
        * Set btn mames
        * */

        btnNameList.add(new MainActivityListItem("calculator" , 1));
        btnNameList.add(new MainActivityListItem("app2" , 2));
        btnNameList.add(new MainActivityListItem("ap3" , 3));
        btnNameList.add(new MainActivityListItem("app4" , 4));
        btnNameList.add(new MainActivityListItem("app5" , 5));
        btnNameList.add(new MainActivityListItem("app6" , 6));
        btnNameList.add(new MainActivityListItem("app7" , 7));
        btnNameList.add(new MainActivityListItem("app8" , 8));
        btnNameList.add(new MainActivityListItem("app9" , 9));

        adapter = new MainActivityRecyclerView(this , btnNameList , mainAppBtnPressred);
        mainRecyclerView.setAdapter(adapter);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(AppSettings.TAG , "onStart: MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(AppSettings.TAG , "onStop: MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(AppSettings.TAG , "onDestroy: MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(AppSettings.TAG , "onPause: MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(AppSettings.TAG , "ononResumeStart: MainActivity");
    }
}
