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
                R.drawable.hotel1,
                "Tigers Air",
                "10:50",
                "11:50",
                "Malang",
                "Surabaya",
                "Rp 500.000"
        ));
        pesawatList.add(new Pesawat(
                2,
                R.drawable.hotel1,
                "LOLOL Air",
                "10:50",
                "11:50",
                "Malang",
                "Surabaya",
                "Rp 500.000"
        ));
        pesawatList.add(new Pesawat(
                3,
                R.drawable.hotel1,
                "WEWE Air",
                "10:50",
                "11:50",
                "Malang",
                "Surabaya",
                "Rp 500.000"
        ));
        pesawatList.add(new Pesawat(
                4,
                R.drawable.hotel1,
                "AWAW Air",
                "10:50",
                "11:50",
                "Malang",
                "Surabaya",
                "Rp 500.000"
        ));
    }
}
