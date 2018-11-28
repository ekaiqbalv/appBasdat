package com.mshop.eka.apppesenin;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class KamarHotelActivity extends AppCompatActivity {
    ConstraintLayout c_layout_hotel_kamar;
    List<Kamar> kamarList = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamar_hotel);


        recyclerView = findViewById(R.id.rv_layout_kamar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new KamarAdapter(getApplicationContext(), kamarList));


        kamarList.add(new Kamar(
                1,
                "ekaHomo",
                "Maks 69 tamu",
                "PS4",
                "Makan Pagi",
                "Rp. 399.000.000"

        ));
        kamarList.add(new Kamar(
                2,
                "GayVillage",
                "Maks 69 tamu",
                "PS4",
                "Makan Pagi",
                "Rp. 399.000.000"

        ));
        kamarList.add(new Kamar(
                3,
                "HUMUEKA",
                "Maks 69 tamu",
                "PS4",
                "Makan Pagi",
                "Rp. 399.000.000"

        ));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        c_layout_hotel_kamar = findViewById(R.id.c_layout_hotel_kamar);


    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
