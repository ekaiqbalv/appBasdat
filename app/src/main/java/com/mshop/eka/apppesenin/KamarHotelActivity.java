package com.mshop.eka.apppesenin;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class KamarHotelActivity extends AppCompatActivity {
    ConstraintLayout c_layout_hotel_kamar;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamar_hotel);

        Hotel currentHotel = (Hotel) getIntent().getSerializableExtra("hotel");
        PesanHotel dataPesan = (PesanHotel) getIntent().getSerializableExtra("dataPesan");

        recyclerView = findViewById(R.id.rv_layout_kamar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Kamar> filteredKamar = new ArrayList<>();

        for (Kamar kamar : currentHotel.getKamarList()){
            if(kamar.getTanggal().equalsIgnoreCase(dataPesan.getTanggal())){
                filteredKamar.add(kamar);
            }
        }

        recyclerView.setAdapter(new KamarAdapter(getBaseContext(), filteredKamar,currentHotel,dataPesan));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        c_layout_hotel_kamar = findViewById(R.id.c_layout_hotel_kamar);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}