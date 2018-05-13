package com.example.shenkar.androidstudiocourseapp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class MainAppBtnPressred implements View.OnClickListener {

    Context context;
    public MainAppBtnPressred(Context context) {
        this.context = context;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case 1:
                Log.d(AppSettings.TAG , "onStartClicked 1");
                Intent intent = new Intent(context , CalculatorActivity.class);
                context.startActivity(intent);
                break;

            case 2:
                Log.d(AppSettings.TAG , "onStartClicked 2");
              /*  Intent intent = new Intent("android.intent.action.Customer");
                context.startActivity(intent);*/
                break;

            case 3:
                Log.d(AppSettings.TAG , "onStartClicked 3");
               /* Intent intent = new Intent("android.intent.action.Customer");
                context.startActivity(intent);*/
                break;

                /*
                * etc ...
                * */
        }
    }
}
