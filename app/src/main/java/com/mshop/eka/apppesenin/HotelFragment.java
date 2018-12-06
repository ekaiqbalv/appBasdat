package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import static android.app.Activity.RESULT_OK;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment{
    String lokasi, tanggal;
    String dataLokasi,dataTanggal,dataDurasi;

    LinearLayout ll_hotel_lokasi;
    LinearLayout ll_hotel_tanggal;
    LinearLayout ll_hotel_durasi;
    TextView tv_hotel_lokasi;
    TextView tv_hotel_tanggal;
    Button b_cari_kamar;

    private static final int REQUEST_CODE_LOCATION = 1;
    private static final int REQUEST_CODE_CALENDAR = 2;

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hotel, container, false);
        String[] hotel_durasi = getResources().getStringArray(R.array.hotel_durasi);
        Spinner spinner = (Spinner) v.findViewById(R.id.spinner_hotel_durasi);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item,hotel_durasi);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                lokasi = data.getStringExtra("editLocValue");
                tv_hotel_lokasi.setText(lokasi);
            }
        }
        else if(requestCode == 2){
            if(resultCode == RESULT_OK){
                tanggal = data.getStringExtra("editDateValue");
                tv_hotel_tanggal.setText(tanggal);
            }
        }
        dataLokasi = lokasi;
        dataTanggal = tanggal;
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        final PesanHotel pesanHotel = new PesanHotel();

        ll_hotel_lokasi = view.findViewById(R.id.fragment_hotel_ll_lokasi);
        ll_hotel_tanggal = view.findViewById(R.id.fragment_hotel_ll_tanggal);
        ll_hotel_durasi = view.findViewById(R.id.fragment_hotel_ll_lama_inap);

        tv_hotel_lokasi = view.findViewById(R.id.tv_hotel_lokasi);
        tv_hotel_tanggal = view.findViewById(R.id.tv_hotel_tanggal);
        b_cari_kamar = view.findViewById(R.id.b_cari_kamar);

        dataLokasi = tv_hotel_lokasi.getText().toString();
        dataTanggal = tv_hotel_tanggal.getText().toString();

        Spinner spinner = view.findViewById(R.id.spinner_hotel_durasi);
        final String[] durasi = getContext().getResources().getStringArray(R.array.hotel_durasi);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                dataDurasi = durasi[position];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ll_hotel_lokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HotelLokasiActivity.class);
                startActivityForResult(intent,1);
            }
        });
        ll_hotel_tanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),CalenderActivity.class);
                startActivityForResult(intent,2);
            }
        });
        b_cari_kamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),DaftarHotelActivity.class);
//                pesanHotel.setIdTransaksi(1);
//                pesanHotel.setLokasiKota(dataLokasi);
//                pesanHotel.setTanggal(dataTanggal);
//                pesanHotel.setDurasi(dataDurasi);
//                intent.putExtra("dataPesan", pesanHotel);
                startActivity(intent);
            }
        });
    }
}