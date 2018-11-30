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
        final Hotel itemHotel = (Hotel) getIntent().getSerializableExtra("hotel");
        iv_hotel_gambar_detail.setImageResource(itemHotel.getGambar());
        tv_hotel_nama.setText(itemHotel.getNamaHotel());
        tv_hotel_bintang.setText(itemHotel.getRating());
        tv_hotel_lokasi_daerah.setText(itemHotel.getLokasiDaerah());
        tv_hotel_lokasi_kota.setText(itemHotel.getLokasiKota());
        b_hotel_pilih_kamar = findViewById(R.id.b_hotel_pilih_kamar);

        b_hotel_pilih_kamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idHotel = itemHotel.getIdHotel();
                String namaHotel = itemHotel.getNamaHotel();
                Intent intent = new Intent(getBaseContext(), KamarHotelActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("IdHotel",idHotel);
                extras.putString("NamaHotel",namaHotel);
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