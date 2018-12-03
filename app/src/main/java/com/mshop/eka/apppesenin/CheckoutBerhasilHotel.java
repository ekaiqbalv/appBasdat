package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class CheckoutBerhasilHotel extends AppCompatActivity {
    ArrayList<PesanAktif> pesanAktifArrayList;
    Random random;
    int jumlahPembayaran;
    String jumlahPembayaranString;

    TextView tv_idTransaksi, tv_jumlahBayar, tv_noRek;
    ImageView iv_logo_bank;
    Button b_konfirmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_berhasil_hotel);

        PesanAktif pesanAktif = new PesanAktif();

        pesanAktifArrayList = new ArrayList<>();

        final Kamar kamar = (Kamar)getIntent().getSerializableExtra("kamar");
        final PesanHotel dataPesan = (PesanHotel) getIntent().getSerializableExtra("dataPesan");
        final Hotel hotel = (Hotel) getIntent().getSerializableExtra("hotel");
        final PembayaranHotel pembayaranHotel = (PembayaranHotel) getIntent().getSerializableExtra("pembayaranHotel");
        random = new Random();
        tv_idTransaksi = findViewById(R.id.tv_idTransaksi);
        tv_jumlahBayar = findViewById(R.id.tv_jumlahBayar);
        tv_noRek = findViewById(R.id.tv_noRek);
        iv_logo_bank = findViewById(R.id.iv_logo_bank);
        b_konfirmasi = findViewById(R.id.b_konfirmasi);

        tv_idTransaksi.setText(Integer.toString(pembayaranHotel.getIdTransaksi()));
        jumlahPembayaran = (Integer.parseInt(pembayaranHotel.getTotalTagihan()))+random.nextInt(900) + 100;;
        jumlahPembayaranString = NumberFormat.getNumberInstance(Locale.GERMAN).format(jumlahPembayaran);
        tv_jumlahBayar.setText(jumlahPembayaranString);

        if(pembayaranHotel.getNamaBank().equalsIgnoreCase("bca")){
            iv_logo_bank.setImageResource(R.drawable.bankbca);
            tv_noRek.setText("3721773939");
        }
        else if(pembayaranHotel.getNamaBank().equalsIgnoreCase("bri")){
            iv_logo_bank.setImageResource(R.drawable.bankbri);
            tv_noRek.setText("5121773939");
        }
        else if(pembayaranHotel.getNamaBank().equalsIgnoreCase("bni")){
            iv_logo_bank.setImageResource(R.drawable.bankbni);
            tv_noRek.setText("8171773939");
        }
        else if(pembayaranHotel.getNamaBank().equalsIgnoreCase("mandiri")){
            iv_logo_bank.setImageResource(R.drawable.bankmandiri);
            tv_noRek.setText("0121773939");
        }

        b_konfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bingung gua pasing datanya biar bisa ditampilin di activitypesananaktif
//                pesanAktif.setIdTransaksi(dataPesan.getIdTransaksi());
//                pesanAktif.setNamaPemesan(dataPesan.getNamaPemesan());
//                pesanAktif.setNamaPesanan(hotel.getNamaHotel());
//                String daerah = hotel.getLokasiDaerah();
//                String kota = hotel.getLokasiKota();
//                String lokasi = daerah+", "+kota;
//                pesanAktif.setLokasiAtauJam(lokasi);
//                pesanAktif.setTglPesanan(dataPesan.getTanggal());
//                pesanAktif.setDekripsiPesanan1(kamar.getNamaKamar());
//                String maksTamu = kamar.getMakstamu();
//                String deskripsi2 = "Maksimal Tamu "+maksTamu;
//                pesanAktif.setDeskripsiPesanan2(deskripsi2);
//                pesanAktif.setHargaPesanan(tv_jumlahBayar.getText().toString());
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
