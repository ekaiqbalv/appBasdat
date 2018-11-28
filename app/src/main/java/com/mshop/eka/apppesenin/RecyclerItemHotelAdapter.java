package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerItemHotelAdapter extends RecyclerView.Adapter<RecyclerItemHotelAdapter.HotelViewHolder>{

    private Context mContext;
    private List<RecyclerItemHotel> itemHotels;
    int id;

    public int getId() {
        return id;
    }

    public RecyclerItemHotelAdapter(Context mContext, List<RecyclerItemHotel> itemHotels) {
        this.mContext = mContext;
        this.itemHotels = itemHotels;
    }
    public RecyclerItemHotelAdapter() {
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.cardview_daftar_hotel,null);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final HotelViewHolder holder, final int position) {
        RecyclerItemHotel recyclerItemHotel = itemHotels.get(position);
        //-----------------------------------------------------------
        holder.textViewJudul.setText(recyclerItemHotel.getJudul());
        holder.textViewRating.setText(recyclerItemHotel.getRating());
        holder.textViewLokasi.setText(recyclerItemHotel.getLokasi());
        holder.textViewHarga.setText(recyclerItemHotel.getHarga());

        holder.imageView.setImageDrawable(mContext.getResources().getDrawable(recyclerItemHotel.getGambar()));

        holder.ll_hotel_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = itemHotels.get(position).getId();
                Context context = mContext;
                Toast.makeText(context, "This is my Toast message! "+id,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, DetailHotelActivity.class);
                intent.putExtra("hotel", itemHotels.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemHotels.size();
    }

    //ViewHoldernya
    class HotelViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewJudul,textViewRating,textViewLokasi,textViewHarga;
        LinearLayout ll_hotel_daftar;

        public HotelViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_rv_hotel);
            textViewJudul = itemView.findViewById(R.id.tv_rv_judul);
            textViewRating = itemView.findViewById(R.id.tv_rv_rating);
            textViewLokasi = itemView.findViewById(R.id.tv_rv_lokasi);
            textViewHarga = itemView.findViewById(R.id.tv_rv_harga);
            ll_hotel_daftar = itemView.findViewById(R.id.ll_hotel_daftar);
        }
    }
}
