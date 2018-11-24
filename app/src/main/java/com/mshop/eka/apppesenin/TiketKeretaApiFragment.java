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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import static android.app.Activity.RESULT_OK;


/**
 * A simple {@link Fragment} subclass.
 */
public class TiketKeretaApiFragment extends Fragment {

    TextView tv_kereta_stasiun_asal;
    TextView tv_kereta_stasiun_tujuan;
    TextView tv_kereta_tgl;
    Button b_cari_tiket_kereta;
    LinearLayout ll_kereta_tgl;
    LinearLayout ll_kereta_stasiun_asal;
    LinearLayout ll_kereta_stasiun_tujuan;

    public TiketKeretaApiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_tiket_kereta_api, container, false);
        View v = inflater.inflate(R.layout.fragment_tiket_kereta_api, container, false);
        String[] kereta_penumpang = getResources().getStringArray(R.array.penumpang);
        Spinner spinner = (Spinner) v.findViewById(R.id.spinner_kereta_penumpang);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item,kereta_penumpang);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tv_kereta_stasiun_asal = view.findViewById(R.id.tv_kereta_stasiun_asal);
        tv_kereta_stasiun_tujuan = view.findViewById(R.id.tv_kereta_stasiun_tujuan);
        tv_kereta_tgl = view.findViewById(R.id.tv_kereta_tgl);

        ll_kereta_stasiun_asal = view.findViewById(R.id.fragment_kereta_ll_stasiun_asal);
        ll_kereta_stasiun_tujuan = view.findViewById(R.id.fragment_kereta_ll_stasiun_tujuan);
        ll_kereta_tgl = view.findViewById(R.id.fragment_kereta_ll_tgl_berangkat);

        b_cari_tiket_kereta = view.findViewById(R.id.b_cari_tiket_kereta);

        ll_kereta_stasiun_asal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),KeretaStasiunAsalActivity.class);
                startActivityForResult(intent,1);
            }
        });
        ll_kereta_stasiun_tujuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),KeretaStasiunTujuanActivity.class);
                startActivityForResult(intent,2);
            }
        });
        ll_kereta_tgl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),CalenderActivity.class);
                startActivityForResult(intent,3);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                String strEditText = data.getStringExtra("editStasiunAsalValue");
                tv_kereta_stasiun_asal.setText(strEditText);
            }
        }
        else if(requestCode == 2){
            if(resultCode == RESULT_OK){
                String strEditText = data.getStringExtra("editStasiunTujuanValue");
                tv_kereta_stasiun_tujuan.setText(strEditText);
            }
        }
        else if(requestCode == 3){
            if(resultCode == RESULT_OK){
                String strEditText = data.getStringExtra("editDateValue");
                tv_kereta_tgl.setText(strEditText);
            }
        }
    }
}
