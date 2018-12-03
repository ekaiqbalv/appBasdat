package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PesanKamarHotelActivity extends AppCompatActivity {
    String hargaTotalString;

    Button b_hotel_detail_pesanan;
    TextView tv_namaHotel,tv_lokasiDaerah, tv_lokasiKota, tv_tgl, tv_durasiInap, tv_namaKamar, tv_maksTamu, tv_durasiHitung, tv_hargaHitung, tv_hargaTotal;
    EditText et_namaPemesan, et_nomor, et_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_kamar_hotel);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final Kamar kamar = (Kamar)getIntent().getSerializableExtra("kamar");
        final PesanHotel dataPesan = (PesanHotel) getIntent().getSerializableExtra("dataPesan");
        final Hotel hotel = (Hotel) getIntent().getSerializableExtra("hotel");
        b_hotel_detail_pesanan = findViewById(R.id.b_hotel_detail_pesanan);
        tv_namaHotel = findViewById(R.id.tv_pesanKamar_namaHotel);
        tv_lokasiDaerah = findViewById(R.id.tv_pesanKamar_lokasiDaerah);
        tv_lokasiKota = findViewById(R.id.tv_pesanKamar_lokasiKota);
        tv_tgl = findViewById(R.id.tv_pesanKamar_tgl);
        tv_durasiInap = findViewById(R.id.tv_pesanKamar_durasi);
        tv_namaKamar = findViewById(R.id.tv_pesanKamar_namaKamar);
        tv_maksTamu = findViewById(R.id.tv_pesanKamar_maksTamu);
        tv_durasiHitung = findViewById(R.id.tv_pesanKamar_durasi_hitung);
        tv_hargaHitung = findViewById(R.id.tv_pesanKamar_harga_hitung);
        tv_hargaTotal = findViewById(R.id.tv_pesanKamar_harga_total);
        et_namaPemesan = findViewById(R.id.et_pesanHotel_nama);
        et_nomor = findViewById(R.id.et_pesanHotel_nomorHp);
        et_email = findViewById(R.id.et_pesanHotel_email);

        tv_namaHotel.setText(hotel.getNamaHotel());
        tv_lokasiDaerah.setText(hotel.getLokasiDaerah());
        tv_lokasiKota.setText(hotel.getLokasiKota());
        tv_durasiInap.setText(dataPesan.getDurasi());
        tv_namaKamar.setText(kamar.getNamaKamar());
        tv_tgl.setText(dataPesan.getTanggal());
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
                dataPesan.setNamaPemesan(et_namaPemesan.getText().toString());
                dataPesan.setNomorHp(et_nomor.getText().toString());
                dataPesan.setEmail(et_email.getText().toString());
                Context context = v.getContext();
                Intent intent = new Intent(context, ReviewPesanKamarHotelActivity.class);
                intent.putExtra("hotel",hotel);
                intent.putExtra("dataPesan",dataPesan);
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
