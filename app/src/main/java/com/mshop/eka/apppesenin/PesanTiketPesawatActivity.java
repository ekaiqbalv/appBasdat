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
    TextView tv_namaMaskapai, tv_waktuBerangkat, tv_waktuSampai, tv_tgl, tv_bandaraAsal, tv_terminalAsal, tv_bandaraTujuan,
            tv_terminalTujuan, tv_penumpang, tv_biaya, tv_biayaTotal;
    EditText et_namaPemesan, et_nomorHp, et_email;
    ImageView iv_logoMaskapai;
    Button b_pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_tiket_pesawat);

        final Pesawat itemPesawat = (Pesawat) getIntent().getSerializableExtra("pesawat");
        final PesanPesawat dataPesanPesawat = (PesanPesawat) getIntent().getSerializableExtra("dataPesanPesawat");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_namaMaskapai = findViewById(R.id.tv_pesanPesawat_namaMaskapai);
        iv_logoMaskapai = findViewById(R.id.iv_pesanPesawat_logoMaskapai);
        tv_waktuBerangkat = findViewById(R.id.tv_pesanPesawat_waktuBerangkat);
        tv_waktuSampai = findViewById(R.id.tv_pesanPesawat_waktuSampai);
        tv_tgl = findViewById(R.id.tv_pesanPesawat_tgl);
        tv_bandaraAsal = findViewById(R.id.tv_pesanPesawat_bandaraAsal);
        tv_terminalAsal = findViewById(R.id.tv_pesanPesawat_terminalAsal);
        tv_bandaraTujuan = findViewById(R.id.tv_pesanPesawat_bandaraTujuan);
        tv_terminalTujuan = findViewById(R.id.tv_pesanPesawat_terminalTujuan);
        et_namaPemesan = findViewById(R.id.et_pesanPesawat_nama);
        et_nomorHp = findViewById(R.id.et_pesanPesawat_noHp);
        et_email = findViewById(R.id.et_pesanPesawat_email);
        tv_penumpang = findViewById(R.id.tv_pesanPenumpang_hitung);
        tv_biaya = findViewById(R.id.tv_pesanPesawat_harga_hitung);
        tv_biayaTotal = findViewById(R.id.tv_pesanPesawat_harga_total);

        b_pesan = findViewById(R.id.b_pesanPesawat_detail_pesanan);

        tv_namaMaskapai.setText(itemPesawat.getNama_Maskapai());
        iv_logoMaskapai.setImageResource(itemPesawat.getImageMaskapai());
        tv_waktuBerangkat.setText(itemPesawat.getWaktuBerangkat());
        tv_waktuSampai.setText(itemPesawat.getWaktuSampai());
        tv_tgl.setText(itemPesawat.getTanggal());
        tv_bandaraAsal.setText(itemPesawat.getBandaraAsalSingkat());
        tv_terminalAsal.setText(itemPesawat.getTerminalAsal());
        tv_bandaraTujuan.setText(itemPesawat.getBandaraTujuanSingkat());
        tv_terminalTujuan.setText(itemPesawat.getTerminalTujuan());
        tv_penumpang.setText(dataPesanPesawat.getPenumpang());
        tv_biaya.setText(itemPesawat.getHarga());
        int jumlahPenumpang = Integer.parseInt(tv_penumpang.getText().toString());
        int hargaTiketPesawat = Integer.parseInt(itemPesawat.getHarga());
        int hargaTotalInt = jumlahPenumpang*hargaTiketPesawat;
        String hargaTotalString = Integer.toString(hargaTotalInt);
        tv_biayaTotal.setText(hargaTotalString);

        b_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataPesanPesawat.setNamaPemesan(et_namaPemesan.getText().toString());
                dataPesanPesawat.setNomorHp(et_nomorHp.getText().toString());
                dataPesanPesawat.setEmail(et_email.getText().toString());
                dataPesanPesawat.setTotalBiaya(tv_biayaTotal.getText().toString());
                Intent intent = new Intent(getBaseContext(), ReviewPesanTiketPesawatActivity.class);
                intent.putExtra("dataPesanPesawat",dataPesanPesawat);
                intent.putExtra("pesawat", itemPesawat);
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
