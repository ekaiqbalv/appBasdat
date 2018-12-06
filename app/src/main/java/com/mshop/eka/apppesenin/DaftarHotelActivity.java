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

        final PesanHotel dataPesan = (PesanHotel) getIntent().getSerializableExtra("dataPesan");
        hotelList = new ArrayList<>();
        recyclerView = findViewById(R.id.Layout_rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        ArrayList<Kamar> kamarList = new ArrayList<>();
//        kamarList.add(new Kamar(
//                1,
//                "Deluxe Room",
//                "2",
//                "Gratis Sarapan",
//                "Gratis WiFi",
//                "399000",
//                "23/12/2018",
//                "40"
//        ));
//        kamarList.add(new Kamar(
//                2,
//                "Superior Room",
//                "2",
//                "Gratis Sarapan",
//                "Gratis WiFi",
//                "499000",
//                "24/12/2018",
//                "20"
//        ));
//        kamarList.add(new Kamar(
//                3,
//                "King's Room",
//                "4",
//                "Gratis Sarapan",
//                "Gratis WiFi",
//                "1229000",
//                "23/12/2018",
//                "10"
//        ));
//
//        Hotel hotel1 = new Hotel(
//                1,
//                R.drawable.bankbca,
//                "Everyday",
//                "Bintang Alkahal1",
//                "Bintaro",
//                "Tangerang",
//                "900991"
//        );
//        hotel1.setKamar(kamarList);
//        hotelList.add(hotel1);
//
//        Hotel hotel2 = new Hotel(
//                2,
//                R.drawable.hotel1,
//                "Buat Susah",
//                "Bintang Alkahal2",
//                "Ciater",
//                "Tangerang",
//                "900991"
//        );
//        hotel2.setKamar(kamarList);
//        hotelList.add(hotel2);
//
//        Hotel hotel3 = new Hotel(
//                3,
//                R.drawable.hotel1,
//                "Recycler View Ampas",
//                "Bintang Alkahal3",
//                "BSD",
//                "Tangerang",
//                "900991"
//        );
//        hotel3.setKamar(kamarList);
//        hotelList.add(hotel3);
//
//        Hotel hotel4 = new Hotel(
//                4,
//                R.drawable.hotel1,
//                "Jancuk Buntu",
//                "Bintang Alkahal4",
//                "Lowokwaru",
//                "Malang",
//                "900991"
//        );
//        hotel4.setKamar(kamarList);
//        hotelList.add(hotel4);
//
//        Hotel hotel5 = new Hotel(
//                5,
//                R.drawable.hotel1,
//                "Jancuk",
//                "Bintang Alkahal5",
//                "Ciputat",
//                "Tangerang",
//                "900991"
//        );
//        hotel5.setKamar(kamarList);
//        hotelList.add(hotel5);
//
//        Hotel hotel6 = new Hotel(
//                6,
//                R.drawable.hotel1,
//                "Coklah",
//                "Bintang Alkahal6",
//                "Menteng",
//                "Jakarta",
//                "900991"
//        );
//        hotel6.setKamar(kamarList);
//        hotelList.add(hotel6);
//
//        ArrayList<Hotel> filteredHotel = new ArrayList<>();
//        for (Hotel hotel : hotelList){
//            for (Kamar kamar : hotel.getKamarList()){
//                    if(dataPesan.getTanggal().equalsIgnoreCase(kamar.getTanggal())&&dataPesan.getLokasiKota().equalsIgnoreCase(hotel.getLokasiKota())) {
//                        filteredHotel.add(hotel);
//                        break;
//                    }
//            }
//        }

//        recyclerItemHotelAdapter = new HotelAdapter(this,filteredHotel,dataPesan);
        recyclerView.setAdapter(recyclerItemHotelAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}