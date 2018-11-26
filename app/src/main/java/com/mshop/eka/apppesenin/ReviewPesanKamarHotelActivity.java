package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReviewPesanKamarHotelActivity extends AppCompatActivity {
    Button b_hotel_detail_pesanan_review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_pesan_kamar_hotel);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        b_hotel_detail_pesanan_review = (Button) findViewById(R.id.b_hotel_detail_pesanan_review);
        b_hotel_detail_pesanan_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, MetodePembayaranActivity.class);
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