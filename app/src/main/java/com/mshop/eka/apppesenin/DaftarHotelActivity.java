package com.mshop.eka.apppesenin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarHotelActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerItemHotelAdapter recyclerItemHotelAdapter;
    List<RecyclerItemHotel> hotelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_hotel);

        hotelList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.Layout_rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        hotelList.add(new RecyclerItemHotel(
                1,
                R.drawable.hotel1,
                "Eka Love Hotel",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));
        hotelList.add(new RecyclerItemHotel(
                2,
                R.drawable.hotel1,
                "Eka Homo",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));
        hotelList.add(new RecyclerItemHotel(
                3,
                R.drawable.hotel1,
                "Eka Syabu",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));
        hotelList.add(new RecyclerItemHotel(
                4,
                R.drawable.hotel1,
                "Eka Buntu",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));
        hotelList.add(new RecyclerItemHotel(
                5,
                R.drawable.hotel1,
                "Eka Sange",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));
        hotelList.add(new RecyclerItemHotel(
                6,
                R.drawable.hotel1,
                "Eka Love Hotel",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));




        recyclerItemHotelAdapter = new RecyclerItemHotelAdapter(this,hotelList);
        recyclerView.setAdapter(recyclerItemHotelAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
