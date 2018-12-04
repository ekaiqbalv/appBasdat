package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MetodePembayaranActivity extends AppCompatActivity {
    String namaBank;
    TextView tv_totaltagihan_angka, tv_penjelasanmetodepembayaran2;
    EditText et_nopemilikrekening, et_namapemilikrekening;
    Button b_metode_pembayaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_pembayaran);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Kamar kamar = (Kamar)getIntent().getSerializableExtra("kamar");
        final PesanHotel dataPesan = (PesanHotel) getIntent().getSerializableExtra("dataPesan");
        final Hotel hotel = (Hotel) getIntent().getSerializableExtra("hotel");
        final PembayaranHotel pembayaranHotel = new PembayaranHotel();

        final String[] bank = getResources().getStringArray(R.array.bank);
        Spinner spinner = findViewById(R.id.spinner_bank);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item,bank);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        tv_totaltagihan_angka = findViewById(R.id.tv_totaltagihan_angka);
        et_nopemilikrekening = findViewById(R.id.et_nopemilikrekening);
        et_namapemilikrekening = findViewById(R.id.et_namapemilikrekening);
        tv_penjelasanmetodepembayaran2 = findViewById(R.id.tv_penjelasanmetodepembayaran2);
        b_metode_pembayaran = findViewById(R.id.b_metode_pembayaran);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                namaBank = bank[position];
                pembayaranHotel.setNamaBank(namaBank);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        pembayaranHotel.setIdTransaksi(dataPesan.getIdTransaksi());
        pembayaranHotel.setTotalTagihan(dataPesan.getTotalBiaya());
        tv_totaltagihan_angka.setText(pembayaranHotel.getTotalTagihan());

        b_metode_pembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pembayaranHotel.setNomorRekening(et_nopemilikrekening.getText().toString());
                pembayaranHotel.setNamaRekening(et_namapemilikrekening.getText().toString());
                Context context = v.getContext();
                Intent intent = new Intent(context, CheckoutBerhasilHotel.class);
                intent.putExtra("pembayaranHotel",pembayaranHotel);
                intent.putExtra("dataPesan",dataPesan);
                intent.putExtra("kamar",kamar);
                intent.putExtra("hotel", hotel);
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
