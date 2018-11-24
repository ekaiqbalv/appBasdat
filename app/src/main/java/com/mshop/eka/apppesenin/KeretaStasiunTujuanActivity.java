package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class KeretaStasiunTujuanActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kereta_stasiun_tujuan);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] lokasi_hotel = getResources().getStringArray(R.array.hotel_lokasi);

        AutoCompleteTextView editStasiunTujuan = findViewById(R.id.actv_kereta_stasiun_tujuan);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.custom_list_search_stasiun, R.id.tv_custom,lokasi_hotel);
        editStasiunTujuan.setAdapter(adapter);
        editStasiunTujuan.setOnItemClickListener(this);
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
        intent.putExtra("editStasiunTujuanValue", item);
        setResult(RESULT_OK, intent);
        finish();
    }
}
