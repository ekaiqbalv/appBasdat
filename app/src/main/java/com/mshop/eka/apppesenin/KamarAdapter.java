package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class KamarAdapter extends RecyclerView.Adapter<KamarAdapter.KamarViewHolder> {
    private Context mCtx;
    private List<Kamar> kamarList;
    private Hotel hotel;
    private PesanHotel dataPesan;

    public KamarAdapter(Context mCtx, List<Kamar> kamarList, Hotel hotel, PesanHotel dataPesan) {
        this.mCtx = mCtx;
        this.kamarList = kamarList;
        this.hotel = hotel;
        this.dataPesan = dataPesan;
    }

    @NonNull
    @Override
    public KamarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.cardview_daftar_kamar, parent, false);
        return new KamarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KamarViewHolder holder, final int position) {
        final Kamar kamar = kamarList.get(position);

        holder.textViewNamaKamar.setText(kamar.getNamaKamar());
//        holder.textViewMakstamu.setText(kamar.getMakstamu());
        holder.textViewSarapan.setText(kamar.getSarapan());
        holder.textViewWifi.setText(kamar.getWifi());
        holder.textViewHarga.setText(kamar.getHarga());
//        holder.textViewKuota.setText(kamar.getKuota());

        holder.cl_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, PesanKamarHotelActivity.class);
                intent.putExtra("hotel",hotel);
                intent.putExtra("dataPesan",dataPesan);
                intent.putExtra("kamar", kamar);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return kamarList.size();
    }

    class KamarViewHolder extends RecyclerView.ViewHolder{
        TextView textViewNamaKamar, textViewMakstamu,textViewSarapan, textViewWifi,textViewHarga, textViewKuota;
        ConstraintLayout cl_item;

        public KamarViewHolder(View itemView) {
            super(itemView);

            textViewNamaKamar = itemView.findViewById(R.id.rv_tv_kamar_judul);
            textViewMakstamu = itemView.findViewById(R.id.rv_tv_kamar_makstamu);
            textViewSarapan = itemView.findViewById(R.id.rv_tv_kamar_sarapan);
            textViewWifi = itemView.findViewById(R.id.rv_tv_kamar_wifi);
            textViewHarga = itemView.findViewById(R.id.rv_tv_kamar_harga);
            textViewKuota = itemView.findViewById(R.id.rv_tv_kamar_kuota);
            cl_item = itemView.findViewById(R.id.c_layout_hotel_kamar);
        }
    }
}