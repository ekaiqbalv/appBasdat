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
    DetailPemesanPesawat detailPemesanPesawat;
    String namaPemesan, nomorHPPemesan, emailPemesan;
    TextView tv_namaMaskapai, tv_waktuBerangkat, tv_waktuSampai, tv_tgl, tv_bandaraAsal, tv_terminalAsal, tv_bandaraTujuan,
            tv_terminalTujuan, tv_penumpang, tv_biaya, tv_biayaTotal;
    EditText et_namaPemesan, et_nomorHp, et_email;
    ImageView iv_logoMaskapai;
    Button b_pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_tiket_pesawat);

        final Penerbangan penerbangan = (Penerbangan) getIntent().getSerializableExtra("pesawat");
        final CariPesawat cariPesawat = (CariPesawat) getIntent().getSerializableExtra("dataPesanPesawat");
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

        tv_namaMaskapai.setText(penerbangan.getKodePenerbangan());
//        iv_logoMaskapai.setImageResource(penerbangan.getImageMaskapai());
        tv_waktuBerangkat.setText(penerbangan.getWaktuKeberangkatan());
        tv_waktuSampai.setText(penerbangan.getWaktuKedatangan());
        tv_tgl.setText(penerbangan.getTanggalPenerbangan());
//        tv_bandaraAsal.setText(penerbangan.getBandaraAsalSingkat());
        tv_terminalAsal.setText(Integer.toString(penerbangan.getIdTerminalKeberangkatan()));
//        tv_bandaraTujuan.setText(penerbangan.getBandaraTujuanSingkat());
        tv_terminalTujuan.setText(Integer.toString(penerbangan.getIdTerminalKedatangan()));
        tv_penumpang.setText(cariPesawat.getJumlahPenumpang());
        tv_biaya.setText(penerbangan.getHarga());
        int jumlahPenumpang = Integer.parseInt(cariPesawat.getJumlahPenumpang());
        int hargaTiketPesawat = Integer.parseInt(penerbangan.getHarga());
        int hargaTotalInt = jumlahPenumpang*hargaTiketPesawat;
        String hargaTotalString = Integer.toString(hargaTotalInt);
        tv_biayaTotal.setText(hargaTotalString);

        b_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaPemesan = et_namaPemesan.getText().toString();
                nomorHPPemesan = et_nomorHp.getText().toString();
                emailPemesan = et_email.getText().toString();
                detailPemesanPesawat = new DetailPemesanPesawat(1,namaPemesan,nomorHPPemesan,emailPemesan);
                Intent intent = new Intent(getBaseContext(), ReviewPesanTiketPesawatActivity.class);
                intent.putExtra("dataPesanPesawat",cariPesawat);
                intent.putExtra("pesawat", penerbangan);
                intent.putExtra("pemesanPesawat",detailPemesanPesawat);
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
