package com.mshop.eka.apppesenin;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class PesananFragment extends Fragment implements BottomNavigationView.OnNavigationItemSelectedListener{

    FrameLayout fragment_pesanan;

    public PesananFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pesanan, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fragment_pesanan = view.findViewById(R.id.fragment_pesanan);
        loadFragment(new PesananAktifFragment());
        BottomNavigationView navigationPesanan = (BottomNavigationView) view.findViewById(R.id.navigationPesanan);
        navigationPesanan.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.navigation_pesanan_aktif:
                fragment = new PesananAktifFragment();
                break;
            case R.id.navigation_pesanan_selesai:
                fragment = new PesananSelesaiFragment();
                break;
            default:
                fragment = new PesananAktifFragment();
        }
        loadFragment(fragment);
        return true;
    }

    private boolean loadFragment(Fragment fragment) {
        if(fragment != null){
            getChildFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_pesanan, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}
