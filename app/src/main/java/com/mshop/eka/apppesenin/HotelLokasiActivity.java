package com.mshop.eka.apppesenin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class HotelLokasiActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_lokasi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] lokasi_hotel = getResources().getStringArray(R.array.hotel_lokasi);

        AutoCompleteTextView editLokasi = findViewById(R.id.actv_hotal_lokasi);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.custom_list_search_hotel, R.id.tv_custom,lokasi_hotel);
        editLokasi.setAdapter(adapter);
        editLokasi.setOnItemClickListener(this);
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
        intent.putExtra("editLocValue", item);
        setResult(RESULT_OK, intent);
        finish();
    }
}
