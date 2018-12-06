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

        final CariHotel cariHotel = (CariHotel) getIntent().getSerializableExtra("dataPesanHotel");
        hotelList = new ArrayList<>();
        recyclerView = findViewById(R.id.Layout_rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Kamar> kamarList = new ArrayList<>();

        Hotel hotel1 = new Hotel(
                1,
                "Everyday",
                "Bintang 3",
                "Bintaro",
                "Tangerang",
                "399000",
                getString(R.string.deskripsiHotel),
                getString(R.string.fasilitasHotel)
        );

        kamarList.add(new Kamar(
                1,
                1,
                "Deluxe Room",
                "2",
                "Gratis Sarapan",
                "Gratis WiFi",
                "23/12/2018",
                "399000"
        ));

        kamarList.add(new Kamar(
                2,
                1,
                "Superior Room",
                "2",
                "Gratis Sarapan",
                "Gratis WiFi",
                "23/12/2018",
                "499000"
        ));
        kamarList.add(new Kamar(
                3,
                1,
                "King's Room",
                "4",
                "Gratis Sarapan",
                "Gratis WiFi",
                "23/12/2018",
                "1229000"
        ));

        hotel1.setKamarList(kamarList);
        hotelList.add(hotel1);

        ArrayList<Hotel> filteredHotel = new ArrayList<>();
        for (Hotel hotel : hotelList){
            for (Kamar kamar : hotel.getKamarList()){
                if(cariHotel.getTanggalInap().equalsIgnoreCase(kamar.getTanggal())&&cariHotel.getLokasiHotel().equalsIgnoreCase(hotel.getLokasiKota())) {
                    filteredHotel.add(hotel);
                    break;
                }
            }
        }

        recyclerItemHotelAdapter = new HotelAdapter(this,filteredHotel,cariHotel);
        recyclerView.setAdapter(recyclerItemHotelAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}