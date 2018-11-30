package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class KamarHotelActivity extends AppCompatActivity {
    int id_hotel;
    String nama_hotel;

    ConstraintLayout c_layout_hotel_kamar;
    List<Kamar> kamarList = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamar_hotel);

        //Get idHotel, buat select tabel kamar where id hotel = id_hotel(hasil parsing)
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int id_hotel = extras.getInt("IdHotel");
        //atribut nama_hotel sementara doang ini, nanti select nama hotel dari id hotel.
        String nama_hotel = extras.getString("NamaHotel");

        recyclerView = findViewById(R.id.rv_layout_kamar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new KamarAdapter(getBaseContext(), kamarList));

        kamarList.add(new Kamar(
                nama_hotel,
                1,
                "Deluxe Room",
                "2",
                "Gratis Sarapan",
                "Gratis WiFi",
                "399000"
        ));
        kamarList.add(new Kamar(
                nama_hotel,
                2,
                "Superior Room",
                "2",
                "Gratis Sarapan",
                "Gratis WiFi",
                "499000"
        ));
        kamarList.add(new Kamar(
                nama_hotel,
                3,
                "King Room",
                "4",
                "Gratis Sarapan",
                "Gratis WiFi",
                "1229000"
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