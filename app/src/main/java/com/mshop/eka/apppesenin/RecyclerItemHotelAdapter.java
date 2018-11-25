package com.mshop.eka.apppesenin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerItemHotelAdapter extends RecyclerView.Adapter<RecyclerItemHotelAdapter.HotelViewHolder>{

    private Context mContext;
    private List<RecyclerItemHotel> itemHotels;

    public RecyclerItemHotelAdapter(Context mContext, List<RecyclerItemHotel> itemHotels) {
        this.mContext = mContext;
        this.itemHotels = itemHotels;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.cardview_daftar_hotel,null);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        RecyclerItemHotel recyclerItemHotel = itemHotels.get(position);
        //-----------------------------------------------------------
        holder.textViewJudul.setText(recyclerItemHotel.getJudul());
        holder.textViewRating.setText(recyclerItemHotel.getRating());
        holder.textViewLokasi.setText(recyclerItemHotel.getLokasi());
        holder.textViewHarga.setText(recyclerItemHotel.getHarga());

        holder.imageView.setImageDrawable(mContext.getResources().getDrawable(recyclerItemHotel.getGambar()));
    }

    @Override
    public int getItemCount() {
        return itemHotels.size();
    }

    //ViewHoldernya
    class HotelViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewJudul,textViewRating,textViewLokasi,textViewHarga;


        public HotelViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_rv_hotel);
            textViewJudul = itemView.findViewById(R.id.tv_rv_judul);
            textViewRating = itemView.findViewById(R.id.tv_rv_rating);
            textViewLokasi = itemView.findViewById(R.id.tv_rv_lokasi);
            textViewHarga = itemView.findViewById(R.id.tv_rv_harga);
        }
    }
}
