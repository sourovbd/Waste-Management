package com.example.androide.citycleaner;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class Menu_Individual extends AppCompatActivity implements View.OnClickListener{

    Button requestButton;
    Button reminderButton;
    Button notificationButtonButton;
    Button nearestBinButton;
    Button reportButton;
    Button usePointsButton;
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__individual);
        requestButton = (Button)findViewById(R.id.button5);
        reminderButton = (Button)findViewById(R.id.button2);
        notificationButtonButton = (Button)findViewById(R.id.button3);
        nearestBinButton = (Button)findViewById(R.id.button6);
        reportButton = (Button)findViewById(R.id.button4);
        usePointsButton = (Button)findViewById(R.id.button8);

        requestButton.setOnClickListener(this);
        reminderButton.setOnClickListener(this);
        notificationButtonButton.setOnClickListener(this);
        nearestBinButton.setOnClickListener(this);
        reportButton.setOnClickListener(this);
        usePointsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button6:
                Intent intent = new Intent(Menu_Individual.this,MapsActivity.class);
                startActivity(intent);
                break;

            case R.id.button2:
                showDateDialog();
                break;

            case R.id.button4:
                Intent intent2 = new Intent(Menu_Individual.this,ReportGarbage_IndividualActivity.class);
                startActivity(intent2);
                break;

            case R.id.button5:
                Intent intent3 = new Intent(Menu_Individual.this,RequestTogovt_IndividualActivity.class);
                startActivity(intent3);
                break;

            case R.id.button3:
                Intent intent4 = new Intent(Menu_Individual.this,GovtNotification_IndividualActivity.class);
                startActivity(intent4);
                break;
        }
    }

    public void showDateDialog(){
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {

                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }
}
