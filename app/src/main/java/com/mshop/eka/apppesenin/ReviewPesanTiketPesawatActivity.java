package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReviewPesanTiketPesawatActivity extends AppCompatActivity {
    Button b_pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_pesan_tiket_pesawat);

//        final Pesawat itemPesawat = (Pesawat) getIntent().getSerializableExtra("pesawat");
        b_pesan = findViewById(R.id.b_pesan_detail_pesanan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        b_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MetodePembayaranPesawatActivity.class);
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
