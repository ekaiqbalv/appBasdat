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

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class CheckoutBerhasilPesawat extends AppCompatActivity {
    Random random;
    int jumlahPembayaran;
    String jumlahPembayaranString;

    TextView tv_idTransaksi, tv_jumlahBayar, tv_noRek;
    ImageView iv_logo_bank;
    Button b_konfirmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_berhasil_pesawat);

        final Pesawat itemPesawat = (Pesawat) getIntent().getSerializableExtra("pesawat");
        final PesanPesawat dataPesanPesawat = (PesanPesawat) getIntent().getSerializableExtra("dataPesanPesawat");
        final PembayaranPesawat pembayaranPesawat = (PembayaranPesawat) getIntent().getSerializableExtra("pembayaranPesawat");
        random = new Random();
        tv_idTransaksi = findViewById(R.id.tv_idTransaksiPesawat);
        tv_jumlahBayar = findViewById(R.id.tv_jumlahBayarPesawat);
        tv_noRek = findViewById(R.id.tv_noRekPesawat);
        iv_logo_bank = findViewById(R.id.iv_logo_bankPesawat);
        b_konfirmasi = findViewById(R.id.b_konfirmasiPesawat);

        tv_idTransaksi.setText(Integer.toString(pembayaranPesawat.getIdTransaksi()));
        jumlahPembayaran = (Integer.parseInt(pembayaranPesawat.getTotalTagihan()))+random.nextInt(900) + 100;;
        jumlahPembayaranString = NumberFormat.getNumberInstance(Locale.GERMAN).format(jumlahPembayaran);
        tv_jumlahBayar.setText(jumlahPembayaranString);

        if(pembayaranPesawat.getNamaBank().equalsIgnoreCase("bca")){
            iv_logo_bank.setImageResource(R.drawable.bankbca);
            tv_noRek.setText("3721773939");
        }
        else if(pembayaranPesawat.getNamaBank().equalsIgnoreCase("bri")){
            iv_logo_bank.setImageResource(R.drawable.bankbri);
            tv_noRek.setText("5121773939");
        }
        else if(pembayaranPesawat.getNamaBank().equalsIgnoreCase("bni")){
            iv_logo_bank.setImageResource(R.drawable.bankbni);
            tv_noRek.setText("8171773939");
        }
        else if(pembayaranPesawat.getNamaBank().equalsIgnoreCase("mandiri")){
            iv_logo_bank.setImageResource(R.drawable.bankmandiri);
            tv_noRek.setText("0121773939");
        }

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
    public void onBackPressed() {

    }
}
