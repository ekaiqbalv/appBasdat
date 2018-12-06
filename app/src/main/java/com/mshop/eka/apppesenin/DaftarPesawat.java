package com.mshop.eka.apppesenin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class DaftarPesawat extends AppCompatActivity {
    RecyclerView recyclerView;
    PesawatAdapter pesawatAdapter;

    TextView tv_pencarianKotaAsal, tv_pencarianKotaTujuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pesawat);

        final CariPesawat cariPesawat = (CariPesawat) getIntent().getSerializableExtra("dataPesanPesawat");

        tv_pencarianKotaAsal = findViewById(R.id.tv_pencarian_kotaAsal);
        tv_pencarianKotaTujuan = findViewById(R.id.tv_pencarian_kotaTujuan);

        tv_pencarianKotaAsal.setText(cariPesawat.getKotaKeberangkatan());
        tv_pencarianKotaTujuan.setText(cariPesawat.getKotaKedatangan());

        ArrayList<Penerbangan> penerbanganArrayList = new ArrayList<>();

        recyclerView = findViewById(R.id.Layout_rv_pesawat);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Penerbangan p1 = new Penerbangan(
                1,
                1,
                2,
                "GA-720",
                "23/12/2018",
                "08:20",
                "10:10",
                "Malang",
                "Jakarta",
                "1 Jam 50 Menit",
                "91000"
        );

        Penerbangan p2 = new Penerbangan(
                2,
                4,
                3,
                "JT-120",
                "23/12/2018",
                "08:20",
                "10:10",
                "Malang",
                "Jakarta",
                "1 Jam 50 Menit",
                "920000"
        );

        Penerbangan p3 = new Penerbangan(
                3,
                6,
                5,
                "ID-20",
                "23/12/2018",
                "08:20",
                "10:10",
                "Malang",
                "Jakarta",
                "1 Jam 50 Menit",
                "930000"
        );

        Penerbangan p4 = new Penerbangan(
                4,
                7,
                8,
                "QZ-320",
                "23/12/2018",
                "08:20",
                "10:10",
                "Malang",
                "Jakarta",
                "1 Jam 50 Menit",
                "940000"
        );

        penerbanganArrayList.add(p1);
        penerbanganArrayList.add(p2);
        penerbanganArrayList.add(p3);
        penerbanganArrayList.add(p4);

        ArrayList<Penerbangan> filteredPenerbangan = new ArrayList<>();
        for (Penerbangan penerbangan : penerbanganArrayList){
            if(cariPesawat.getTanggalPenerbangan().equalsIgnoreCase(penerbangan.getTanggalPenerbangan())&&cariPesawat.getKotaKeberangkatan().equalsIgnoreCase(penerbangan.getKotaKeberangkatan())&&
                    cariPesawat.getKotaKedatangan().equalsIgnoreCase(penerbangan.getKotaKedatangan())){
                filteredPenerbangan.add(penerbangan);
            }
        }

        pesawatAdapter = new PesawatAdapter(this,filteredPenerbangan,cariPesawat);
        recyclerView.setAdapter(pesawatAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}