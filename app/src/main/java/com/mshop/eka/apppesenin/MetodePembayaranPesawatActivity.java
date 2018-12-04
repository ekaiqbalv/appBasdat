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

public class MetodePembayaranPesawatActivity extends AppCompatActivity {
    String namaBank;
    TextView tv_totaltagihan_angka, tv_penjelasanmetodepembayaran2;
    EditText et_nopemilikrekening, et_namapemilikrekening;
    Button b_metode_pembayaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_pembayaran_pesawat);

        final Pesawat itemPesawat = (Pesawat) getIntent().getSerializableExtra("pesawat");
        final PesanPesawat dataPesanPesawat = (PesanPesawat) getIntent().getSerializableExtra("dataPesanPesawat");
        final  PembayaranPesawat pembayaranPesawat = new PembayaranPesawat();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final String[] bank = getResources().getStringArray(R.array.bank);
        Spinner spinner = (Spinner) findViewById(R.id.spinner_bankPesawat);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item,bank);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        tv_totaltagihan_angka = findViewById(R.id.tv_totaltagihan_angkaPesawat);
        et_nopemilikrekening = findViewById(R.id.et_nopemilikrekeningPesawat);
        et_namapemilikrekening = findViewById(R.id.et_namapemilikrekeningPesawat);
        tv_penjelasanmetodepembayaran2 = findViewById(R.id.tv_penjelasanmetodepembayaran2Pesawat);
        b_metode_pembayaran = findViewById(R.id.b_metode_pembayaranPesawat);

        pembayaranPesawat.setIdTransaksi(dataPesanPesawat.getIdTransaksi());
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                namaBank = bank[position];
                pembayaranPesawat.setNamaBank(namaBank);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        pembayaranPesawat.setTotalTagihan(dataPesanPesawat.getTotalBiaya());
        tv_totaltagihan_angka.setText(pembayaranPesawat.getTotalTagihan());

        b_metode_pembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pembayaranPesawat.setNomorRekening(et_nopemilikrekening.getText().toString());
                pembayaranPesawat.setNamaRekening(et_namapemilikrekening.getText().toString());
                Context context = v.getContext();
                Intent intent = new Intent(context, CheckoutBerhasilPesawat.class);
                intent.putExtra("dataPesanPesawat",dataPesanPesawat);
                intent.putExtra("pesawat", itemPesawat);
                intent.putExtra("pembayaranPesawat", pembayaranPesawat);
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
