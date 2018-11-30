package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReviewPesanKamarHotelActivity extends AppCompatActivity {
    int durasiInap, hargaInap, hargaTotalInt;
    String hargaTotalString;

    Button b_hotel_detail_pesanan_review;
    TextView tv_namaHotel, tv_durasiInap, tv_namaKamar, tv_maksTamu, tv_durasiHitung, tv_hargaHitung, tv_hargaTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_pesan_kamar_hotel);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Kamar kamar = (Kamar)getIntent().getSerializableExtra("kamar");

        tv_namaHotel = findViewById(R.id.tv_reviewKamar_namaHotel);
        tv_durasiInap = findViewById(R.id.tv_reviewKamar_durasi);
        tv_namaKamar = findViewById(R.id.tv_reviewKamar_namaKamar);
        tv_maksTamu = findViewById(R.id.tv_reviewKamar_maksTamu);
        tv_durasiHitung = findViewById(R.id.tv_reviewKamar_durasi_hitung);
        tv_hargaHitung = findViewById(R.id.tv_reviewKamar_harga_hitung);
        tv_hargaTotal = findViewById(R.id.tv_reviewKamar_harga_total);

        b_hotel_detail_pesanan_review = findViewById(R.id.b_hotel_detail_pesanan_review);

        tv_namaHotel.setText(kamar.getNamaHotel());
        tv_durasiInap.setText("3");
        tv_namaKamar.setText(kamar.getNamaKamar());
        tv_maksTamu.setText(kamar.getMakstamu());
        tv_durasiHitung.setText(tv_durasiInap.getText());
        tv_hargaHitung.setText(kamar.getHarga());
        durasiInap = Integer.parseInt(tv_durasiInap.getText().toString());
        hargaInap = Integer.parseInt(kamar.getHarga());
        hargaTotalInt = durasiInap*hargaInap;
        hargaTotalString = Integer.toString(hargaTotalInt);
        tv_hargaTotal.setText(hargaTotalString);

        b_hotel_detail_pesanan_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hargaTotal = tv_hargaTotal.getText().toString();
                Intent intent = new Intent(getBaseContext(), MetodePembayaranActivity.class);
                Bundle extras = new Bundle();
                extras.putString("hargaTotal",hargaTotal);
                intent.putExtras(extras);
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