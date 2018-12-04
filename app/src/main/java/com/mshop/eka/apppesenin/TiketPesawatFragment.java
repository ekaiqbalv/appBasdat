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
public class TiketPesawatFragment extends Fragment {
    String kotaAsal, kotaTujuan, tanggal;
    String dataKotaAsal,dataKotaTujuan,dataTanggal, dataPenumpang;

    TextView tv_pesawat_bandara_asal;
    TextView tv_pesawat_bandara_tujuan;
    TextView tv_pesawat_tgl;

    LinearLayout ll_pesawat_asal;
    LinearLayout ll_pesawat_tujuan;
    LinearLayout ll_pesawat_tgl;
    Button b_cari_tiket_pesawat;

    public TiketPesawatFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tiket_pesawat, container, false);
        String[] pesawat_penumpang = getResources().getStringArray(R.array.penumpang);
        Spinner spinner = (Spinner) v.findViewById(R.id.spinner_pesawat_penumpang);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item,pesawat_penumpang);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                kotaAsal = data.getStringExtra("editKotaAsalValue");
                tv_pesawat_bandara_asal.setText(kotaAsal);
            }
        }
        else if(requestCode == 2){
            if(resultCode == RESULT_OK){
                kotaTujuan = data.getStringExtra("editKotaTujuanValue");
                tv_pesawat_bandara_tujuan.setText(kotaTujuan);
            }
        }
        else if(requestCode == 3){
            if(resultCode == RESULT_OK){
                tanggal = data.getStringExtra("editDateValue");
                tv_pesawat_tgl.setText(tanggal);
            }
        }
        dataKotaAsal = kotaAsal;
        dataKotaTujuan = kotaTujuan;
        dataTanggal = tanggal;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final PesanPesawat pesanPesawat = new PesanPesawat();

        tv_pesawat_bandara_asal = view.findViewById(R.id.tv_pesawat_bandara_asal);
        tv_pesawat_bandara_tujuan = view.findViewById(R.id.tv_pesawat_bandara_tujuan);
        tv_pesawat_tgl = view.findViewById(R.id.tv_pesawat_tgl);

        ll_pesawat_asal = view.findViewById(R.id.fragment_pesawat_ll_bandara_asal);
        ll_pesawat_tujuan = view.findViewById(R.id.fragment_pesawat_ll_bandara_tujuan);
        ll_pesawat_tgl = view.findViewById(R.id.fragment_pesawat_ll_tgl_berangkat);
        b_cari_tiket_pesawat = view.findViewById(R.id.b_cari_tiket_pesawat);

        dataKotaAsal = tv_pesawat_bandara_asal.getText().toString();
        dataKotaTujuan = tv_pesawat_bandara_tujuan.getText().toString();
        dataTanggal = tv_pesawat_tgl.getText().toString();

        Spinner spinner = view.findViewById(R.id.spinner_pesawat_penumpang);
        final String[] penumpang = getContext().getResources().getStringArray(R.array.penumpang);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                dataPenumpang = penumpang[position];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ll_pesawat_asal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),PesawatBandaraAsalActivity.class);
                startActivityForResult(intent,1);
            }
        });
        ll_pesawat_tujuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),PesawatBandaraTujuanActivity.class);
                startActivityForResult(intent,2);
            }
        });
        ll_pesawat_tgl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),CalenderActivity.class);
                startActivityForResult(intent,3);
            }
        });

        b_cari_tiket_pesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),DaftarPesawat.class);
                pesanPesawat.setIdTransaksi(1);
                pesanPesawat.setKotaAsal(dataKotaAsal);
                pesanPesawat.setKotaTujuan(dataKotaTujuan);
                pesanPesawat.setTanggal(dataTanggal);
                pesanPesawat.setPenumpang(dataPenumpang);
                intent.putExtra("dataPesanPesawat", pesanPesawat);
                startActivity(intent);
            }
        });
    }
}
