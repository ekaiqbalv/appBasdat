package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailHotelActivity extends AppCompatActivity {
    ImageView iv_hotel_gambar_detail;

    Button b_hotel_pilih_kamar;
    TextView tv_hotel_nama,tv_hotel_bintang,tv_hotel_lokasi_daerah,tv_hotel_lokasi_kota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hotel);
        iv_hotel_gambar_detail = findViewById(R.id.iv_hotel_gambar_detail);
        tv_hotel_nama = findViewById(R.id.tv_hotel_nama);
        tv_hotel_bintang = findViewById(R.id.tv_hotel_bintang);
        tv_hotel_lokasi_daerah = findViewById(R.id.tv_hotel_lokasi_daerah);
        tv_hotel_lokasi_kota = findViewById(R.id.tv_hotel_lokasi_kota);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final Hotel currentHotel = (Hotel) getIntent().getSerializableExtra("hotel");
        final CariHotel cariHotel = (CariHotel) getIntent().getSerializableExtra("dataPesanHotel");
//        iv_hotel_gambar_detail.setImageResource(currentHotel.getGambar());
        tv_hotel_nama.setText(currentHotel.getNamaHotel());
//        tv_hotel_bintang.setText(currentHotel.getRating());
        tv_hotel_lokasi_daerah.setText(currentHotel.getLokasiDaerah());
        tv_hotel_lokasi_kota.setText(currentHotel.getLokasiKota());
        b_hotel_pilih_kamar = findViewById(R.id.b_hotel_pilih_kamar);

        b_hotel_pilih_kamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), KamarHotelActivity.class);
                intent.putExtra("dataPesanHotel",cariHotel);
                intent.putExtra("hotel", currentHotel);
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