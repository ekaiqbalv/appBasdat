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

public class PesawatAdapter extends RecyclerView.Adapter<PesawatAdapter.PesawatViewHolder>{
    private Context mCtx;
    private List<Pesawat> pesawatList;

    public PesawatAdapter(Context mCtx, List<Pesawat> pesawatList) {
        this.mCtx = mCtx;
        this.pesawatList = pesawatList;
    }

    @NonNull
    @Override
    public PesawatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.cardview_daftar_pesawat,null);
        return new PesawatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PesawatViewHolder holder, int position) {
        Pesawat pesawat = pesawatList.get(position);

        holder.textViewMaskapai.setText(pesawat.getNama_Maskapai());
        holder.textViewBrangkat.setText(pesawat.getWaktuBrangkat());
        holder.textViewSampai.setText(pesawat.getWaktuSampai());
        holder.textViewAsal.setText(pesawat.getAsal());
        holder.textViewTujuan.setText(pesawat.getTujuan());
        holder.textViewHarga.setText(pesawat.getHarga());
        holder.imageViewMaskapai.setImageDrawable(mCtx.getResources().getDrawable(pesawat.getImageMaskapai()));
    }

    @Override
    public int getItemCount() {
        return pesawatList.size();
    }

    class PesawatViewHolder extends RecyclerView.ViewHolder{
        TextView textViewMaskapai,textViewBrangkat,textViewSampai,textViewAsal,textViewTujuan,textViewHarga;
        ImageView imageViewMaskapai;
        public PesawatViewHolder(View itemView) {
            super(itemView);

            textViewMaskapai = itemView.findViewById(R.id.tv_rv_pesawat_judul);
            textViewBrangkat = itemView.findViewById(R.id.tv_rv_pesawat_berangkat);
            textViewSampai = itemView.findViewById(R.id.tv_rv_pesawat_sampai);
            textViewAsal = itemView.findViewById(R.id.tv_rv_pesawat_asal);
            textViewTujuan = itemView.findViewById(R.id.tv_rv_pesawat_tujuan);
            textViewHarga = itemView.findViewById(R.id.tv_rv_pesawat_harga);
            imageViewMaskapai = itemView.findViewById(R.id.iv_rv_pesawat);

        }
    }
}
