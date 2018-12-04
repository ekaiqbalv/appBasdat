package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class PesawatBandaraTujuanActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesawat_bandara_tujuan);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] kota_bandara = getResources().getStringArray(R.array.kota_bandara);

        AutoCompleteTextView editBandaraTujuan = findViewById(R.id.actv_pesawat_bandara_tujuan);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.custom_list_search_bandara, R.id.tv_custom_kota,kota_bandara);
        editBandaraTujuan.setAdapter(adapter);
        editBandaraTujuan.setOnItemClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        Intent intent = new Intent();
        intent.putExtra("editKotaTujuanValue", item);
        setResult(RESULT_OK, intent);
        finish();
    }
}
