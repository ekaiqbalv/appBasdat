package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PesanKamarHotelActivity extends AppCompatActivity {
    Button b_hotel_detail_pesanan;
    TextView tv_judulKamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_kamar_hotel);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Kamar kamar = (Kamar)getIntent().getSerializableExtra("kamar");
        b_hotel_detail_pesanan = (Button) findViewById(R.id.b_hotel_detail_pesanan);
        tv_judulKamar = findViewById(R.id.tv_judulKamar);
        tv_judulKamar.setText(kamar.getJudul());

        b_hotel_detail_pesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, ReviewPesanKamarHotelActivity.class);
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
