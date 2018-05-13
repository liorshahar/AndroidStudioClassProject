package com.example.shenkar.androidstudiocourseapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {


    /*Button's*/
    Button btn0 , btn1 , btn2 ,
            btn3 , btn4 , btn5 ,
            btn6 , btn7 , btn8 ,
            btn9 ,
            btnSum , btnClear ,
            btnDevide , btnAdd , btnMultiplay , BtnSubstract;

    /*Text View's*/
    TextView mainView , resultView;

    /*Calculator Variable*/
    int num1 , num2 , result;

    /*  --   1 = + , 2 = - , 3 = / , 4 = * -- */
    int action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_activitu);

        Log.d(AppSettings.TAG , "onCreate: CalculatorActivity");
        initUiComponents();
    }

    public void initUiComponents(){
        /*init the buttons*/

        btn0 = (Button)findViewById(R.id.button0);
        btn0.setOnClickListener(this);
        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        btn5 = (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(this);
        btn6 = (Button)findViewById(R.id.button6);
        btn6.setOnClickListener(this);
        btn7 = (Button)findViewById(R.id.button7);
        btn7.setOnClickListener(this);
        btn8 = (Button)findViewById(R.id.button8);
        btn8.setOnClickListener(this);
        btn9 = (Button)findViewById(R.id.button9);
        btn9.setOnClickListener(this);

        btnSum = (Button)findViewById(R.id.sumButton);
        btnSum.setOnClickListener(this);

        btnClear = (Button)findViewById(R.id.clearButton);
        btnClear.setOnClickListener(this);

        btnDevide = (Button)findViewById(R.id.devideButton);
        btnDevide.setOnClickListener(this);

        btnAdd = (Button)findViewById(R.id.addButton);
        btnAdd.setOnClickListener(this);

        btnMultiplay = (Button)findViewById(R.id.multiplyButton);
        btnMultiplay.setOnClickListener(this);

        BtnSubstract = (Button)findViewById(R.id.substractButton);
        BtnSubstract.setOnClickListener(this);

        /*init the test view*/
        mainView = (TextView)findViewById(R.id.mainView);
        resultView = (TextView)findViewById(R.id.resultView);

        /*init variable*/

        num1 = 0;
        num2 = 0;



    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button0:
                if (mainView.getText().toString().equals("0")) {
                    break;
                } else {
                    mainView.setText(mainView.getText().toString() + "0");
                }
                break;
            case R.id.button1:
                if (mainView.getText().toString().equals("0")) {
                    mainView.setText("1");
                } else {
                    mainView.setText(mainView.getText().toString() + "1");
                }
                break;
            case R.id.button2:
                if (mainView.getText().toString().equals("0")) {
                    mainView.setText("2");
                } else {
                    mainView.setText(mainView.getText().toString() + "2");
                }
                break;
            case R.id.button3:
                if (mainView.getText().toString().equals("0")) {
                    mainView.setText("3");
                } else {
                    mainView.setText(mainView.getText().toString() + "3");
                }
                break;
            case R.id.button4:
                if (mainView.getText().toString().equals("0")) {
                    mainView.setText("4");
                } else {
                    mainView.setText(mainView.getText().toString() + "4");
                }
                break;
            case R.id.button5:
                if (mainView.getText().toString().equals("0")) {
                    mainView.setText("5");
                } else {
                    mainView.setText(mainView.getText().toString() + "5");
                }
                break;
            case R.id.button6:
                if (mainView.getText().toString().equals("0")) {
                    mainView.setText("6");
                } else {
                    mainView.setText(mainView.getText().toString() + "6");
                }
                break;
            case R.id.button7:
                if (mainView.getText().toString().equals("0")) {
                    mainView.setText("7");
                } else {
                    mainView.setText(mainView.getText().toString() + "7");
                }
                break;
            case R.id.button8:
                if (mainView.getText().toString().equals("0")) {
                    mainView.setText("8");
                } else {
                    mainView.setText(mainView.getText().toString() + "8");
                }
                break;
            case R.id.button9:
                if (mainView.getText().toString().equals("0")) {
                    mainView.setText("9");
                } else {
                    mainView.setText(mainView.getText().toString() + "9");
                }
                break;
            case R.id.addButton:
                if (mainView.getText().toString().equals("0")) {
                    break;
                } else {
                    action = 1;
                    num1 = Integer.parseInt(mainView.getText().toString());
                    resultView.setText(mainView.getText().toString() + " +");
                    mainView.setText("");
                }
                break;
            case R.id.substractButton:
                if (mainView.getText().toString().equals("0")) {
                    break;
                } else {
                    action = 2;
                    num1 = Integer.parseInt(mainView.getText().toString());
                    resultView.setText(mainView.getText().toString() + " -");
                    mainView.setText("");
                }
                break;
            case R.id.devideButton:
                if (mainView.getText().toString().equals("0")) {
                    break;
                } else {
                    action = 3;
                    num1 = Integer.parseInt(mainView.getText().toString());
                    resultView.setText(mainView.getText().toString() + " /");
                    mainView.setText("");
                }
                break;
            case R.id.multiplyButton:
                if (mainView.getText().toString().equals("0")) {
                    break;
                } else {
                    action = 4;
                    num1 = Integer.parseInt(mainView.getText().toString());
                    resultView.setText(mainView.getText().toString() + " x");
                    mainView.setText("");
                }
                break;
            case R.id.clearButton:
                if (mainView.getText().toString().equals("0")) {
                    break;
                } else {
                    action = 0;
                    num1 = 0;
                    num2 = 0;
                    mainView.setText("0");
                    resultView.setText("");
                }
                break;
            case R.id.sumButton:
                System.out.println("sumButton");
                if (mainView.getText().toString().equals("0")) {
                    break;
                } else {
                    System.out.println("sumButton1");
                    num2 = Integer.parseInt(mainView.getText().toString());
                    System.out.println(num1);
                    System.out.println(num2);
                    System.out.println(action);
                    switch (action) {
                        case 1:
                            result = num1 + num2;
                            System.out.println(result);
                            mainView.setText(Integer.toString(result));
                            action = 0;
                            num1 = 0;
                            num2 = 0;
                            resultView.setText("");
                            break;
                        case 2:
                            result = num1 - num2;
                            mainView.setText(Integer.toString(result));
                            action = 0;
                            num1 = 0;
                            num2 = 0;
                            resultView.setText("");
                            break;
                        case 3:
                            result = num1 / num2;
                            mainView.setText(Integer.toString(result));
                            action = 0;
                            num1 = 0;
                            num2 = 0;
                            resultView.setText("");
                            break;
                        case 4:
                            result = num1 * num2;
                            mainView.setText(Integer.toString(result));
                            action = 0;
                            num1 = 0;
                            num2 = 0;
                            resultView.setText("");
                            break;

                    }
                }
                break;
        }
    }

}
