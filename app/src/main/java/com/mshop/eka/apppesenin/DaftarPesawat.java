package com.mshop.eka.apppesenin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DaftarPesawat extends AppCompatActivity {
    RecyclerView recyclerView;
    PesawatAdapter pesawatAdapter;
    List<Pesawat> pesawatList;

    TextView tv_pencarianKotaAsal, tv_pencarianKotaTujuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pesawat);

        final PesanPesawat dataPesanPesawat = (PesanPesawat) getIntent().getSerializableExtra("dataPesanPesawat");

        tv_pencarianKotaAsal = findViewById(R.id.tv_pencarian_kotaAsal);
        tv_pencarianKotaTujuan = findViewById(R.id.tv_pencarian_kotaTujuan);

        tv_pencarianKotaAsal.setText(dataPesanPesawat.getKotaAsal());
        tv_pencarianKotaTujuan.setText(dataPesanPesawat.getKotaTujuan());

        pesawatList = new ArrayList<>();
        recyclerView = findViewById(R.id.Layout_rv_pesawat);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        pesawatList.add(new Pesawat(
                1,
                R.drawable.lion,
                "Lion Air",
                "23/12/2018",
                "08:25",
                "10:00",
                "Jakarta",
                "Soekarno Hatta International Airport",
                "CGK",
                "Terminal 1",
                "Malang",
                "Abdul Rachman Saleh",
                "MLG",
                "Terminal 2",
                "JT-120",
                "1 Jam 35 Menit",
                "Boeing 737",
                "3-3",
                "31",
                "7",
                "20",
                "200",
                "700000"
        ));
        pesawatList.add(new Pesawat(
                2,
                R.drawable.citilink,
                "Citilink",
                "23/12/2018",
                "08:25",
                "10:00",
                "Jakarta",
                "Soekarno Hatta International Airport",
                "CGK",
                "Terminal 1",
                "Malang",
                "Abdul Rachman Saleh",
                "MLG",
                "Terminal 2",
                "QG-412",
                "1 Jam 35 Menit",
                "Boeing 737",
                "3-3",
                "31",
                "7",
                "20",
                "200",
                "900000"
        ));
        pesawatList.add(new Pesawat(
                3,
                R.drawable.batik,
                "Batik Air",
                "25/12/2018",
                "08:25",
                "10:00",
                "Jakarta",
                "Soekarno Hatta International Airport",
                "CGK",
                "Terminal 1",
                "Malang",
                "Abdul Rachman Saleh",
                "MLG",
                "Terminal 2",
                "ID-612",
                "1 Jam 35 Menit",
                "Boeing 737",
                "3-3",
                "31",
                "7",
                "20",
                "200",
                "800000"
        ));
        pesawatList.add(new Pesawat(
                4,
                R.drawable.garuda,
                "Garuda Indonesia",
                "24/12/2018",
                "08:25",
                "10:00",
                "Jakarta",
                "Soekarno Hatta International Airport",
                "CGK",
                "Terminal 1",
                "Malang",
                "Abdul Rachman Saleh",
                "MLG",
                "Terminal 3",
                "GA-363",
                "1 Jam 35 Menit",
                "Boeing 737",
                "3-3",
                "31",
                "7",
                "20",
                "200",
                "970000"
        ));

        ArrayList<Pesawat> filteredPesawat = new ArrayList<>();
        for (Pesawat pesawat : pesawatList){
            if(dataPesanPesawat.getTanggal().equalsIgnoreCase(pesawat.getTanggal())&&dataPesanPesawat.getKotaAsal().equalsIgnoreCase(pesawat.getKotaAsal())&&
                    dataPesanPesawat.getKotaTujuan().equalsIgnoreCase(pesawat.getKotaTujuan())){
                filteredPesawat.add(pesawat);
            }
        }

        pesawatAdapter = new PesawatAdapter(this,filteredPesawat,dataPesanPesawat);
        recyclerView.setAdapter(pesawatAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}