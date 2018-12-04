package com.mshop.eka.apppesenin;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
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
    private PesanPesawat pesanPesawat;

    public PesawatAdapter(Context mCtx, List<Pesawat> pesawatList, PesanPesawat pesanPesawat) {
        this.mCtx = mCtx;
        this.pesawatList = pesawatList;
        this.pesanPesawat = pesanPesawat;
    }

    @NonNull
    @Override
    public PesawatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.cardview_daftar_pesawat,null);
        return new PesawatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PesawatViewHolder holder, final int position) {
        Pesawat pesawat = pesawatList.get(position);

        holder.tv_namaMaskapai.setText(pesawat.getNama_Maskapai());
        holder.iv_Maskapai.setImageDrawable(mCtx.getResources().getDrawable(pesawat.getImageMaskapai()));
        holder.tv_waktuBerangkat.setText(pesawat.getWaktuBerangkat());
        holder.tv_waktuSampai.setText(pesawat.getWaktuSampai());
        holder.tv_bandaraAsal.setText(pesawat.getBandaraAsalSingkat());
        holder.tv_bandaraTujuan.setText(pesawat.getBandaraTujuanSingkat());
        holder.tv_bagasi.setText(pesawat.getBagasi());
        holder.tv_harga.setText(pesawat.getHarga());
        holder.tv_kuotaPesawat.setText(pesawat.getKuota());

        holder.c_layout_pesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentP = new Intent(mCtx, InfoPesawatActivity.class);
                intentP.putExtra("dataPesanPesawat",pesanPesawat);
                intentP.putExtra("pesawat", pesawatList.get(position));
                mCtx.startActivity(intentP);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pesawatList.size();
    }

    class PesawatViewHolder extends RecyclerView.ViewHolder{
        TextView tv_namaMaskapai, tv_waktuBerangkat, tv_waktuSampai, tv_bandaraAsal, tv_bandaraTujuan, tv_bagasi, tv_harga, tv_kuotaPesawat;
        ImageView iv_Maskapai;
        ConstraintLayout c_layout_pesawat;

        public PesawatViewHolder(View itemView) {
            super(itemView);
            tv_namaMaskapai = itemView.findViewById(R.id.tv_namaMaskapai);
            iv_Maskapai = itemView.findViewById(R.id.iv_logoMaskapai);
            tv_waktuBerangkat = itemView.findViewById(R.id.tv_waktuBerangkat);
            tv_waktuSampai = itemView.findViewById(R.id.tv_waktuSampai);
            tv_bandaraAsal = itemView.findViewById(R.id.tv_bandaraAsal);
            tv_bandaraTujuan = itemView.findViewById(R.id.tv_bandaraTujuan);
            tv_bagasi = itemView.findViewById(R.id.tv_bagasi);
            tv_harga = itemView.findViewById(R.id.tv_hargaPesawat);
            tv_kuotaPesawat = itemView.findViewById(R.id.tv_kuotaPesawat);
            c_layout_pesawat = itemView.findViewById(R.id.c_layout_pesawat);
        }
    }
}
