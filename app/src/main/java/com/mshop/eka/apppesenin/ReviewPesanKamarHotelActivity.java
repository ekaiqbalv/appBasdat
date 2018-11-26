package com.mshop.eka.apppesenin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReviewPesanKamarHotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_pesan_kamar_hotel);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
