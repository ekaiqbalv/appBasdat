package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ReviewPesanTiketPesawatActivity extends AppCompatActivity {
    TextView tv_namaMaskapai, tv_waktuBerangkat, tv_waktuSampai, tv_tgl, tv_bandaraAsal, tv_terminalAsal, tv_bandaraTujuan, tv_terminalTujuan, tv_penumpang, tv_biaya, tv_biayaTotal;
    TextView tv_namaPemesan, tv_nomorHp, tv_email;
    ImageView iv_logoMaskapai;
    Button b_pesanReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_pesan_tiket_pesawat);

        final Penerbangan penerbangan = (Penerbangan) getIntent().getSerializableExtra("pesawat");
        final CariPesawat cariPesawat = (CariPesawat) getIntent().getSerializableExtra("dataPesanPesawat");
        final DetailPemesanPesawat detailPemesanPesawat = (DetailPemesanPesawat) getIntent().getSerializableExtra("pemesanPesawat");

        tv_namaMaskapai = findViewById(R.id.tv_reviewPesawat_namaMaskapai);
        iv_logoMaskapai = findViewById(R.id.iv_reviewPesawat_logoMaskapai);
        tv_waktuBerangkat = findViewById(R.id.tv_reviewPesawat_waktuBerangkat);
        tv_waktuSampai = findViewById(R.id.tv_reviewPesawat_waktuSampai);
        tv_tgl = findViewById(R.id.tv_reviewPesawat_tgl);
        tv_terminalAsal = findViewById(R.id.tv_reviewPesawat_terminalAsal);
        tv_terminalTujuan = findViewById(R.id.tv_reviewPesawat_terminalTujuan);
        tv_bandaraAsal = findViewById(R.id.tv_reviewPesawat_bandaraAsal);
        tv_bandaraTujuan = findViewById(R.id.tv_reviewPesawat_bandaraTujuan);
        tv_namaPemesan = findViewById(R.id.tv_reviewPesawat_namaPemesan);
        tv_nomorHp = findViewById(R.id.tv_reviewPesawat_nomorHp);
        tv_email = findViewById(R.id.tv_reviewPesawat_email);
        tv_penumpang = findViewById(R.id.tv_reviewPenumpang_hitung);
        tv_biaya = findViewById(R.id.tv_reviewPesawat_harga_hitung);
        tv_biayaTotal = findViewById(R.id.tv_reviewPesawat_harga_total);

        b_pesanReview = findViewById(R.id.b_reviewPesawat_detail_pesanan);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_namaMaskapai.setText(penerbangan.getKodePenerbangan());
//        iv_logoMaskapai.setImageResource(penerbangan.getImageMaskapai());
        tv_waktuBerangkat.setText(penerbangan.getWaktuKeberangkatan());
        tv_waktuSampai.setText(penerbangan.getWaktuKedatangan());
        tv_tgl.setText(penerbangan.getTanggalPenerbangan());
//        tv_bandaraAsal.setText(penerbangan.getBandaraAsalSingkat());
        tv_terminalAsal.setText(Integer.toString(penerbangan.getIdTerminalKeberangkatan()));
//        tv_bandaraTujuan.setText(penerbangan.getBandaraTujuanSingkat());
        tv_terminalTujuan.setText(Integer.toString(penerbangan.getIdTerminalKedatangan()));
        tv_namaPemesan.setText(detailPemesanPesawat.getNamaPemesan());
        tv_nomorHp.setText(detailPemesanPesawat.getNomorHPPemesan());
        tv_email.setText(detailPemesanPesawat.getEmailPemesan());
        tv_penumpang.setText(cariPesawat.getJumlahPenumpang());
        tv_biaya.setText(penerbangan.getHarga());
        int jumlahPenumpang = Integer.parseInt(cariPesawat.getJumlahPenumpang());
        int hargaTiketPesawat = Integer.parseInt(penerbangan.getHarga());
        int hargaTotalInt = jumlahPenumpang*hargaTiketPesawat;
        final String hargaTotalString = Integer.toString(hargaTotalInt);
        tv_biayaTotal.setText(hargaTotalString);

        b_pesanReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MetodePembayaranPesawatActivity.class);
                intent.putExtra("pesawat", penerbangan);
                intent.putExtra("pemesanPesawat",detailPemesanPesawat);
                intent.putExtra("hargaPesawat",hargaTotalString);
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
