package com.mshop.eka.apppesenin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class KamarAdapter extends RecyclerView.Adapter<KamarAdapter.KamarViewHolder> {

    private Context mCtx;
    private List<Kamar> kamarList;

    public KamarAdapter(Context mCtx, List<Kamar> kamarList) {
        this.mCtx = mCtx;
        this.kamarList = kamarList;
    }

    @NonNull
    @Override
    public KamarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.cardview_daftar_kamar,null);
        return new KamarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KamarViewHolder holder, int position) {
        Kamar kamar = kamarList.get(position);

        holder.textViewJudul.setText(kamar.getJudul());
        holder.textViewMakstamu.setText(kamar.getMakstamu());
        holder.textViewFasilitas1.setText(kamar.getFasilitas1());
        holder.textViewFasilitas2.setText(kamar.getFasilitas2());
        holder.textViewHarga.setText(kamar.getHarga());


    }

    @Override
    public int getItemCount() {
        return kamarList.size();
    }

    class KamarViewHolder extends RecyclerView.ViewHolder{
        TextView textViewJudul, textViewMakstamu,textViewFasilitas1, textViewFasilitas2,textViewHarga;
        public KamarViewHolder(View itemView) {
            super(itemView);

            textViewJudul = itemView.findViewById(R.id.rv_tv_kamar_judul);
            textViewMakstamu = itemView.findViewById(R.id.rv_tv_kamar_makstamu);
            textViewFasilitas1 = itemView.findViewById(R.id.rv_tv_kamar_fasilitas1);
            textViewFasilitas2 = itemView.findViewById(R.id.rv_tv_kamar_fasilitas2);
            textViewHarga = itemView.findViewById(R.id.rv_tv_kamar_harga);
        }
    }
}
