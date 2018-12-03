package com.mshop.eka.apppesenin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarPesawat extends AppCompatActivity {
    RecyclerView recyclerView;
    PesawatAdapter pesawatAdapter;
    List<Pesawat> pesawatList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pesawat);
        pesawatList = new ArrayList<>();
        recyclerView = findViewById(R.id.Layout_rv_pesawat);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        pesawatAdapter = new PesawatAdapter(this,pesawatList);
        recyclerView.setAdapter(pesawatAdapter);

        pesawatList.add(new Pesawat(
                1,
                R.drawable.lion,
                "Lion Air",
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

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}