package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class PesanTiketPesawatActivity extends AppCompatActivity {
    TextView tv_namaMaskapai, tv_waktuBerangkat, tv_waktuSampai, tv_tgl, tv_bandaraAsal, tv_bandaraTujuan, tv_penumpang, tv_biaya, tv_biayaTotal;
    EditText et_namaPemesan, et_nomorHp, et_email;
    ImageView iv_logoMaskapai;
    Button b_pesan_detail_pesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_tiket_pesawat);

        final Pesawat itemPesawat = (Pesawat) getIntent().getSerializableExtra("pesawat");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_namaMaskapai = findViewById(R.id.tv_pesan_namaMaskapai);
        iv_logoMaskapai = findViewById(R.id.iv_pesan_logoMaskapai);
        tv_waktuBerangkat = findViewById(R.id.tv_pesan_waktuBerangkat);
        tv_waktuSampai = findViewById(R.id.tv_pesan_waktuSampai);
        tv_tgl = findViewById(R.id.tv_pesan_tgl);
        tv_bandaraAsal = findViewById(R.id.tv_pesan_bandaraAsal);
        tv_bandaraTujuan = findViewById(R.id.tv_pesan_bandaraTujuan);
        et_namaPemesan = findViewById(R.id.et_pesanPesawat_nama);
        et_nomorHp = findViewById(R.id.et_pesanPesawat_noHp);
        et_email = findViewById(R.id.et_pesanPesawat_email);
        tv_penumpang = findViewById(R.id.tv_pesanPenumpang_hitung);
        tv_biaya = findViewById(R.id.tv_pesanPesawat_harga_hitung);
        tv_biayaTotal = findViewById(R.id.tv_pesanPesawat_harga_total);

        b_pesan_detail_pesanan = findViewById(R.id.b_pesan_detail_pesanan);

        tv_namaMaskapai.setText(itemPesawat.getNama_Maskapai());
        iv_logoMaskapai.setImageResource(itemPesawat.getImageMaskapai());
        tv_waktuBerangkat.setText(itemPesawat.getWaktuBerangkat());
        tv_waktuSampai.setText(itemPesawat.getWaktuSampai());
        //harusnya get dari data pas milih tanggal kan ya
        tv_tgl.setText("25/12/2018");
        tv_bandaraAsal.setText(itemPesawat.getBandaraAsalSingkat());
        tv_bandaraTujuan.setText(itemPesawat.getBandaraTujuanSingkat());
        //penumpang harusnya diambil dari data pas awal milih
        tv_penumpang.setText("1");
        tv_biaya.setText(itemPesawat.getHarga());
        //getText
        String namaPemesan = et_namaPemesan.getText().toString();
        String nomorHp = et_nomorHp.getText().toString();
        String email = et_nomorHp.getText().toString();

        b_pesan_detail_pesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ReviewPesanTiketPesawatActivity.class);
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
