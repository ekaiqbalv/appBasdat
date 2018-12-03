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

        final Pesawat itemPesawat = (Pesawat) getIntent().getSerializableExtra("pesawat");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_namaMaskapai.setText(itemPesawat.getNama_Maskapai());
        iv_logoMaskapai.setImageResource(itemPesawat.getImageMaskapai());
        tv_nomorPenerbangan.setText(itemPesawat.getNomorPenerbangan());
        tv_kotaAsal.setText(itemPesawat.getKotaAsal());
        tv_waktuBerangkat.setText(itemPesawat.getWaktuBerangkat());
        tv_bandaraAsal.setText(itemPesawat.getBandaraAsal());
        tv_bandaraAsalSingkat.setText(itemPesawat.getBandaraAsalSingkat());
        tv_terminalAsal.setText(itemPesawat.getTerminalAsal());
        tv_durasiPenerbangan.setText(itemPesawat.getDurasi());
        tv_kotaTujuan.setText(itemPesawat.getKotaTujuan());
        tv_waktuSampai.setText(itemPesawat.getWaktuSampai());
        tv_bandaraTujuan.setText(itemPesawat.getBandaraTujuan());
        tv_bandaraTujuanSingkat.setText(itemPesawat.getBandaraTujuanSingkat());
        tv_terminalTujuan.setText(itemPesawat.getTerminalTujuan());
        tv_jenisPesawat.setText(itemPesawat.getJenisPesawat());
        tv_susunanKursi.setText(itemPesawat.getLayoutKursi());
        tv_jarakKursi.setText(itemPesawat.getJarakKursi());
        tv_kabin.setText(itemPesawat.getKabin());
        tv_bagasi.setText(itemPesawat.getBagasi());
        b_infoPesawat_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), PesanTiketPesawatActivity.class);
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
