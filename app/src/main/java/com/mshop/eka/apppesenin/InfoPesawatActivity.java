package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoPesawatActivity extends AppCompatActivity {
    TextView tv_namaMaskapai, tv_nomorPenerbangan, tv_kotaAsal, tv_waktuBerangkat, tv_bandaraAsal,tv_bandaraAsalSingkat, tv_terminalAsal,
            tv_durasiPenerbangan, tv_kotaTujuan, tv_waktuSampai, tv_bandaraTujuan, tv_bandaraTujuanSingkat, tv_terminalTujuan, tv_jenisPesawat,
            tv_susunanKursi, tv_jarakKursi, tv_kabin,tv_bagasi;
    ImageView iv_logoMaskapai;
    Button b_infoPesawat_lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pesawat);

        tv_namaMaskapai = findViewById(R.id.tv_info_namaMaskapai);
        iv_logoMaskapai = findViewById(R.id.iv_info_logoMaskapai);
        tv_nomorPenerbangan = findViewById(R.id.tv_info_nomorPenerbangan);
        tv_kotaAsal = findViewById(R.id.tv_info_kotaAsal);
        tv_waktuBerangkat = findViewById(R.id.tv_info_waktuBerangkat);
        tv_bandaraAsal = findViewById(R.id.tv_info_bandaraAsal);
        tv_bandaraAsalSingkat = findViewById(R.id.tv_info_bandaraAsalSingkat);
        tv_terminalAsal = findViewById(R.id.tv_info_terminalAsal);
        tv_durasiPenerbangan = findViewById(R.id.tv_info_durasi);
        tv_kotaTujuan = findViewById(R.id.tv_info_kotaTujuan);
        tv_waktuSampai = findViewById(R.id.tv_info_waktuSampai);
        tv_bandaraTujuan = findViewById(R.id.tv_info_bandaraTujuan);
        tv_bandaraTujuanSingkat = findViewById(R.id.tv_info_bandaraTujuanSingkat);
        tv_terminalTujuan = findViewById(R.id.tv_info_terminalTujuan);
        tv_jenisPesawat = findViewById(R.id.tv_info_jenisPesawat);
        tv_susunanKursi = findViewById(R.id.tv_info_susunanKursi);
        tv_jarakKursi = findViewById(R.id.tv_info_jarakKursi);
        tv_kabin = findViewById(R.id.tv_info_kabin);
        tv_bagasi = findViewById(R.id.tv_info_bagasi);
        b_infoPesawat_lanjut = findViewById(R.id.b_infoPesawat_lanjut);

        final Penerbangan penerbangan = (Penerbangan) getIntent().getSerializableExtra("pesawat");
        final CariPesawat cariPesawat = (CariPesawat) getIntent().getSerializableExtra("dataPesanPesawat");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        tv_namaMaskapai.setText(penerbangan.getNama_Maskapai());
//        iv_logoMaskapai.setImageResource(penerbangan.getImageMaskapai());
        tv_nomorPenerbangan.setText(penerbangan.getKodePenerbangan());
        tv_kotaAsal.setText(penerbangan.getKotaKeberangkatan());
        tv_waktuBerangkat.setText(penerbangan.getWaktuKeberangkatan());
//        tv_bandaraAsal.setText(penerbangan.getBandaraAsal());
//        tv_bandaraAsalSingkat.setText(penerbangan.getBandaraAsalSingkat());
        tv_terminalAsal.setText(Integer.toString(penerbangan.getIdTerminalKeberangkatan()));
        tv_durasiPenerbangan.setText(penerbangan.getDurasiPenerbangan());
        tv_kotaTujuan.setText(penerbangan.getKotaKedatangan());
        tv_waktuSampai.setText(penerbangan.getWaktuKedatangan());
//        tv_bandaraTujuan.setText(penerbangan.getBandaraTujuan());
//        tv_bandaraTujuanSingkat.setText(penerbangan.getBandaraTujuanSingkat());
        tv_terminalTujuan.setText(Integer.toString(penerbangan.getIdTerminalKedatangan()));
//        tv_jenisPesawat.setText(penerbangan.getJenisPesawat());
//        tv_susunanKursi.setText(penerbangan.getLayoutKursi());
//        tv_jarakKursi.setText(penerbangan.getJarakKursi());
//        tv_kabin.setText(penerbangan.getKabin());
//        tv_bagasi.setText(penerbangan.getBagasi());
        b_infoPesawat_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), PesanTiketPesawatActivity.class);
                intent.putExtra("dataPesanPesawat",cariPesawat);
                intent.putExtra("pesawat", penerbangan);
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
