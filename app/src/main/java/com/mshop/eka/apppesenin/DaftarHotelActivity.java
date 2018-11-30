package com.mshop.eka.apppesenin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class DaftarHotelActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    HotelAdapter recyclerItemHotelAdapter;
    List<Hotel> hotelList;
    LinearLayout ll_daftar_hotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_hotel);

        hotelList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.Layout_rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        hotelList.add(new Hotel(
                1,
                R.drawable.bankbca,
                "Nanta Jancuk",
                "Bintang Alkahal1",
                "Bintaro1",
                "Tangerang1",
                "900991"
        ));
        hotelList.add(new Hotel(
                2,
                R.drawable.hotel1,
                "Buat Susah",
                "Bintang Alkahal2",
                "Bintaro2",
                "Tangerang2",
                "900991"
        ));
        hotelList.add(new Hotel(
                3,
                R.drawable.hotel1,
                "Recycler View Ampas",
                "Bintang Alkahal3",
                "Bintaro3",
                "Tangerang3",
                "900991"
        ));
        hotelList.add(new Hotel(
                4,
                R.drawable.hotel1,
                "Jancuk Buntu",
                "Bintang Alkahal4",
                "Bintaro4",
                "Tangerang4",
                "900991"
        ));
        hotelList.add(new Hotel(
                5,
                R.drawable.hotel1,
                "Jancuk",
                "Bintang Alkahal5",
                "Bintaro5",
                "Tangerang5",
                "900991"
        ));
        hotelList.add(new Hotel(
                6,
                R.drawable.hotel1,
                "Coklah",
                "Bintang Alkahal6",
                "Bintaro6",
                "Tangerang6",
                "900991"
        ));

        recyclerItemHotelAdapter = new HotelAdapter(this,hotelList);
        recyclerView.setAdapter(recyclerItemHotelAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}