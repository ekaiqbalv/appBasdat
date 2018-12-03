package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CalendarView;

public class CalenderActivity extends AppCompatActivity{

    CalendarView calendarView;
    Button buttonSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

         calendarView = (CalendarView) findViewById(R.id.calendarView);

         calendarView.setMinDate(System.currentTimeMillis() - 1000);
         calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
             @Override
             public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                 month = month+1;
                 String coba = dayOfMonth+"/"+month+"/"+year;
                 Intent intent = new Intent();
                 intent.putExtra("editDateValue", coba);
                 setResult(RESULT_OK, intent);
                 finish();
             }
         });
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

}
