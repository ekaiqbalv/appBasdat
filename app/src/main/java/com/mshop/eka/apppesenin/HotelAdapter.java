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

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder>{

    private Context mContext;
    private List<Hotel> itemHotels;
    private CariHotel cariHotel;
    int id;

    public int getId() {
        return id;
    }

    public HotelAdapter(Context mContext, List<Hotel> itemHotels, CariHotel cariHotel) {
        this.mContext = mContext;
        this.itemHotels = itemHotels;
        this.cariHotel = cariHotel;
    }
    public HotelAdapter() {
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
        Hotel recyclerItemHotel = itemHotels.get(position);
        //-----------------------------------------------------------
        holder.textViewNamaHotel.setText(recyclerItemHotel.getNamaHotel());
        holder.textViewRating.setText(recyclerItemHotel.getBintangHotel());
        holder.textViewLokasiDaerah.setText(recyclerItemHotel.getLokasiDaerah());
        holder.textViewLokasiKota.setText(recyclerItemHotel.getLokasiKota());
        holder.textViewHarga.setText(recyclerItemHotel.getHarga());

        holder.ll_hotel_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = mContext;
                Intent intent = new Intent(context, DetailHotelActivity.class);
                intent.putExtra("dataPesanHotel",cariHotel);
                intent.putExtra("hotel", itemHotels.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemHotels.size();
    }

    class HotelViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewNamaHotel,textViewRating,textViewLokasiDaerah,textViewLokasiKota,textViewHarga;
        LinearLayout ll_hotel_daftar;

        public HotelViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_rv_hotel);
            textViewNamaHotel = itemView.findViewById(R.id.tv_rv_nama_hotel);
            textViewRating = itemView.findViewById(R.id.tv_rv_rating);
            textViewLokasiDaerah = itemView.findViewById(R.id.tv_rv_lokasi_daerah);
            textViewLokasiKota = itemView.findViewById(R.id.tv_rv_lokasi_kota);
            textViewHarga = itemView.findViewById(R.id.tv_rv_harga);
            ll_hotel_daftar = itemView.findViewById(R.id.ll_hotel_daftar);
        }
    }
}
