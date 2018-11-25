package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailHotelActivity extends AppCompatActivity {
    Button b_hotel_pilih_kamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hotel);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        b_hotel_pilih_kamar = (Button) findViewById(R.id.b_hotel_pilih_kamar);

        b_hotel_pilih_kamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),KamarHotelActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}