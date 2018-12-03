package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MetodePembayaranPesawatActivity extends AppCompatActivity {
    TextView tv_totaltagihan_angka, tv_penjelasanmetodepembayaran2;
    EditText et_nopemilikrekening, et_namapemilikrekening;
    Button b_metode_pembayaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_pembayaran_pesawat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] bank = getResources().getStringArray(R.array.bank);
        Spinner spinner = (Spinner) findViewById(R.id.spinner_bankPesawat);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item,bank);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        tv_totaltagihan_angka = findViewById(R.id.tv_totaltagihan_angkaPesawat);
        et_nopemilikrekening = findViewById(R.id.et_nopemilikrekeningPesawat);
        et_namapemilikrekening = findViewById(R.id.et_namapemilikrekeningPesawat);
        tv_penjelasanmetodepembayaran2 = findViewById(R.id.tv_penjelasanmetodepembayaran2Pesawat);
        b_metode_pembayaran = findViewById(R.id.b_metode_pembayaranPesawat);

//        tv_totaltagihan_angka.setText(hargaTotal);
        b_metode_pembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, CheckoutBerhasilPesawat.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
