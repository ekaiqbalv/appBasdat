package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CheckoutBerhasilPesawat extends AppCompatActivity {
    TextView tv_idTransaksi, tv_jumlahBayar, tv_noRek;
    ImageView iv_logo_bank;
    Button b_konfirmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_berhasil_pesawat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_idTransaksi = findViewById(R.id.tv_idTransaksiPesawat);
        tv_jumlahBayar = findViewById(R.id.tv_jumlahBayarPesawat);
        tv_noRek = findViewById(R.id.tv_noRekPesawat);
        b_konfirmasi = findViewById(R.id.b_konfirmasiPesawat);

        //Tambahin total harga kamar sama 3 digit angka random(unik). Baru setText jumlahBayar pake nilai itu.

        b_konfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, MainActivity.class);
                Toast.makeText(context,"Terimakasih",Toast.LENGTH_SHORT).show();
                Toast.makeText(context,"Pesanan Dalam Proses Verifikasi",Toast.LENGTH_SHORT).show();
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
