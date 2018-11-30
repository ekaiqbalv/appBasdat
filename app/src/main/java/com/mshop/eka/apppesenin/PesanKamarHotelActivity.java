package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PesanKamarHotelActivity extends AppCompatActivity {
    String hargaTotalString;

    Button b_hotel_detail_pesanan;
    TextView tv_namaHotel, tv_durasiInap, tv_namaKamar, tv_maksTamu, tv_durasiHitung, tv_hargaHitung, tv_hargaTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_kamar_hotel);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final Kamar kamar = (Kamar)getIntent().getSerializableExtra("kamar");
        b_hotel_detail_pesanan = (Button) findViewById(R.id.b_hotel_detail_pesanan);
        tv_namaHotel = findViewById(R.id.tv_pesanKamar_namaHotel);
        tv_durasiInap = findViewById(R.id.tv_pesanKamar_durasi);
        tv_namaKamar = findViewById(R.id.tv_pesanKamar_namaKamar);
        tv_maksTamu = findViewById(R.id.tv_pesanKamar_maksTamu);
        tv_durasiHitung = findViewById(R.id.tv_pesanKamar_durasi_hitung);
        tv_hargaHitung = findViewById(R.id.tv_pesanKamar_harga_hitung);
        tv_hargaTotal = findViewById(R.id.tv_pesanKamar_harga_total);

        tv_namaHotel.setText(kamar.getNamaHotel());
        tv_durasiInap.setText("3");
        tv_namaKamar.setText(kamar.getNamaKamar());
        tv_maksTamu.setText(kamar.getMakstamu());
        tv_durasiHitung.setText(tv_durasiInap.getText());
        tv_hargaHitung.setText(kamar.getHarga());
        int durasiInap = Integer.parseInt(tv_durasiInap.getText().toString());
        int hargaInap = Integer.parseInt(kamar.getHarga());
        int hargaTotalInt = durasiInap*hargaInap;
        hargaTotalString = Integer.toString(hargaTotalInt);
        tv_hargaTotal.setText(hargaTotalString);

        b_hotel_detail_pesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //harusnya sekalian nulis ke db kan ya?terus di class ReviewPesanKamarHotelActivity tinggal get data data ini
                Context context = v.getContext();
                Intent intent = new Intent(context, ReviewPesanKamarHotelActivity.class);
                intent.putExtra("kamar", kamar);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
