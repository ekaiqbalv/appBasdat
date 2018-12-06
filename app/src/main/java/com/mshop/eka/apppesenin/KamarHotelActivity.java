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

        final Hotel currentHotel = (Hotel) getIntent().getSerializableExtra("hotel");
        final CariHotel cariHotel = (CariHotel) getIntent().getSerializableExtra("dataPesanHotel");

        ArrayList<Kamar> filteredKamar = new ArrayList<>();

        for (Kamar kamar : currentHotel.getKamarList()){
            if(kamar.getTanggal().equalsIgnoreCase(cariHotel.getTanggalInap())){
                filteredKamar.add(kamar);
            }
        }


        recyclerView = findViewById(R.id.rv_layout_kamar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new KamarAdapter(getBaseContext(), filteredKamar,currentHotel,cariHotel));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        c_layout_hotel_kamar = findViewById(R.id.c_layout_hotel_kamar);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}