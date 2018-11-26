package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KamarHotelActivity extends AppCompatActivity {
    ConstraintLayout c_layout_hotel_kamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamar_hotel);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        c_layout_hotel_kamar = (ConstraintLayout) findViewById(R.id.c_layout_hotel_kamar);
        c_layout_hotel_kamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, PesanKamarHotelActivity.class);
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
