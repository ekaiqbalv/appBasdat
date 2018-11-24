package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    LinearLayout ll_hotel_lokasi;
    LinearLayout ll_hotel_tanggal;
    LinearLayout ll_hotel_durasi;
    TextView tv_hotel_lokasi;
    TextView tv_hotel_tanggal;
    Button b_cari_kamar;

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_hotel, container, false);
        View v = inflater.inflate(R.layout.fragment_hotel, container, false);
        String[] hotel_durasi = getResources().getStringArray(R.array.hotel_durasi);
        Spinner spinner = (Spinner) v.findViewById(R.id.spinner_hotel_durasi);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item,hotel_durasi);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ll_hotel_lokasi = view.findViewById(R.id.fragment_hotel_ll_lokasi);
        ll_hotel_tanggal = view.findViewById(R.id.fragment_hotel_ll_tanggal);
        ll_hotel_durasi = view.findViewById(R.id.fragment_hotel_ll_lama_inap);

        tv_hotel_lokasi = view.findViewById(R.id.tv_hotel_lokasi);
        tv_hotel_tanggal = view.findViewById(R.id.tv_hotel_tanggal);
        b_cari_kamar = view.findViewById(R.id.b_cari_kamar);

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
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                String strEditText = data.getStringExtra("editLocValue");
                tv_hotel_lokasi.setText(strEditText);
            }
        }
        else if(requestCode == 2){
            if(resultCode == RESULT_OK){
                String strEditText = data.getStringExtra("editDateValue");
                tv_hotel_tanggal.setText(strEditText);
            }
        }
    }
}