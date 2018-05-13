package com.example.shenkar.androidstudiocourseapp;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CreateBirthDayActivity extends AppCompatActivity {


    EditText firstName;
    EditText lastName;
    EditText date;
    TextView title;
    Button submit;
    DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(AppSettings.TAG , "onCreate: CreateBirthDayActivity");
        setContentView(R.layout.activity_create_birth_day);
        init();
    }


    private void init(){

        firstName = findViewById(R.id.birthday_first_name);
        lastName = findViewById(R.id.birthday_last_name);
        date = findViewById(R.id.birthday_date);
        title = findViewById(R.id.birthday_title);
        submit = findViewById(R.id.birtday_submit);


        submit.setOnClickListener(new View.OnClickListener(){

            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            @Override
            public void onClick(View v) {
                Log.d(AppSettings.TAG , "first name: " + firstName.getText());
                Log.d(AppSettings.TAG , "last name: " + lastName.getText());
                Log.d(AppSettings.TAG , "date : " + date.getText());
                Editable myDate = date.getText();
                try {
                    Log.d(AppSettings.TAG , "myDate: " +df.parse(String.valueOf(myDate)));
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
        });


    }
}
