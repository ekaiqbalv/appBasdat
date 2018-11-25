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
    RecyclerItemHotelAdapter recyclerItemHotelAdapter;
    List<RecyclerItemHotel> hotelList;
    LinearLayout ll_daftar_hotel;

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
                "Nanta Jancuk",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));
        hotelList.add(new RecyclerItemHotel(
                2,
                R.drawable.hotel1,
                "Buat Susah",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));
        hotelList.add(new RecyclerItemHotel(
                3,
                R.drawable.hotel1,
                "Recycler View Ampas",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));
        hotelList.add(new RecyclerItemHotel(
                4,
                R.drawable.hotel1,
                "Jancuk Buntu",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));
        hotelList.add(new RecyclerItemHotel(
                5,
                R.drawable.hotel1,
                "Jancuk",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));
        hotelList.add(new RecyclerItemHotel(
                6,
                R.drawable.hotel1,
                "Coklah",
                "Bintang Alkahal",
                "Bintaro",
                "Rp 9.999.999"
        ));

        recyclerItemHotelAdapter = new RecyclerItemHotelAdapter(this,hotelList);
        recyclerView.setAdapter(recyclerItemHotelAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        ll_daftar_hotel = (LinearLayout) findViewById(R.id.ll_hotel_daftar);
//        ll_daftar_hotel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getBaseContext(), DetailHotelActivity.class);
//                startActivity(intent);
//            }
//        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
