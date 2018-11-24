package com.mshop.eka.apppesenin;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PesananSelesaiFragment extends Fragment {

    TextView tv_pesanan_selesai1;
    TextView tv_pesanan_selesai2;
    Button b_pesan_kamar_tiket;

    public PesananSelesaiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pesanan_selesai, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tv_pesanan_selesai1 = view.findViewById(R.id.tv_pesanan_selesai1);
        tv_pesanan_selesai2 = view.findViewById(R.id.tv_pesanan_selesai2);
        b_pesan_kamar_tiket = view.findViewById(R.id.b_pesan_kamar_atau_tiket);
    }
}
