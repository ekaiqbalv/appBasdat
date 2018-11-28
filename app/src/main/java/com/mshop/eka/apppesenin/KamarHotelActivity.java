package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class KamarHotelActivity extends AppCompatActivity {
    ConstraintLayout c_layout_hotel_kamar;
    List<Kamar> kamarList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamar_hotel);


        recyclerView = (RecyclerView) findViewById(R.id.rv_layout_kamar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        kamarList = new ArrayList<>();

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

        c_layout_hotel_kamar = (ConstraintLayout) findViewById(R.id.c_layout_hotel_kamar);
        c_layout_hotel_kamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, PesanKamarHotelActivity.class);
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
