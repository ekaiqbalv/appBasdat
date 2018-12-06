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
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CariFragment extends Fragment implements BottomNavigationView.OnNavigationItemSelectedListener {

    ImageView iv_header;
    FrameLayout fragment_cari;

    public CariFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cari, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        iv_header = view.findViewById(R.id.gambar1);
        fragment_cari = view.findViewById(R.id.fragment_cari);
        loadFragment(new HotelFragment());
        BottomNavigationView navigationCari = (BottomNavigationView) view.findViewById(R.id.navigationCari);
        navigationCari.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.navigation_hotel:
                fragment = new HotelFragment();
                break;
            case R.id.navigation_pesawat:
                fragment = new TiketPesawatFragment();
                break;
            default:
                fragment = new HotelFragment();
        }
        loadFragment(fragment);
        return true;
    }

    private boolean loadFragment(Fragment fragment) {
        if(fragment != null){
            getActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_cari, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}