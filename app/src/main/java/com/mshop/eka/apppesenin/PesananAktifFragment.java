package com.mshop.eka.apppesenin;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PesananAktifFragment extends Fragment {
    TextView tv_namaPemesan, tv_idTransaksi, tv_namaPesanan,tv_lokasiAtauJam, tv_deskripsi1, tv_deskripsi2, tv_tgl, tv_hargaPesanan;

    public PesananAktifFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pesanan_aktif, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tv_namaPemesan = view.findViewById(R.id.tv_aktif_namaPemesan);
        tv_idTransaksi = view.findViewById(R.id.tv_aktif_idTransaksi);
        tv_namaPesanan = view.findViewById(R.id.tv_aktif_namaPesanan);
        tv_lokasiAtauJam = view.findViewById(R.id.tv_aktif_lokasiAtauJam);
        tv_deskripsi1 = view.findViewById(R.id.tv_deskripsi1);
        tv_deskripsi2 = view.findViewById(R.id.tv_deskripsi2);
        tv_tgl = view.findViewById(R.id.tv_tgl);
        tv_hargaPesanan = view.findViewById(R.id.tv_aktif_hargaPesanan);
    }
}
