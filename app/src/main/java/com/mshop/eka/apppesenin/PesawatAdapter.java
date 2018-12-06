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

public class PesawatAdapter extends RecyclerView.Adapter<PesawatAdapter.PesawatViewHolder>{
    private Context mCtx;
    private List<Penerbangan> penerbanganArrayList;
    private CariPesawat cariPesawat;

    public PesawatAdapter(Context mCtx, List<Penerbangan> penerbanganArrayList, CariPesawat cariPesawat) {
        this.mCtx = mCtx;
        this.penerbanganArrayList = penerbanganArrayList;
        this.cariPesawat = cariPesawat;
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
        Penerbangan penerbangan = penerbanganArrayList.get(position);

        holder.tv_namaMaskapai.setText(penerbangan.getKodePenerbangan());
//        holder.iv_Maskapai.setImageDrawable(mCtx.getResources().getDrawable(pesawat.getImageMaskapai()));
        holder.tv_waktuBerangkat.setText(penerbangan.getWaktuKeberangkatan());
        holder.tv_waktuSampai.setText(penerbangan.getWaktuKedatangan());
//        holder.tv_bandaraAsal.setText(penerbangan.getIdTerminalKeberangkatan());
//        holder.tv_bandaraTujuan.setText(penerbangan.getIdTerminalKedatangan());
//        holder.tv_bagasi.setText(penerbangan.getIdPesawat());
        holder.tv_harga.setText(penerbangan.getHarga());
//        holder.tv_kuotaPesawat.setText(penerbangan.getIdPesawat());

        holder.c_layout_pesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentP = new Intent(mCtx, InfoPesawatActivity.class);
                intentP.putExtra("dataPesanPesawat",cariPesawat);
                intentP.putExtra("pesawat", penerbanganArrayList.get(position));
                mCtx.startActivity(intentP);
            }
        });
    }

    @Override
    public int getItemCount() {
        return penerbanganArrayList.size();
    }

    class PesawatViewHolder extends RecyclerView.ViewHolder{
        TextView tv_namaMaskapai, tv_waktuBerangkat, tv_waktuSampai, tv_bandaraAsal, tv_bandaraTujuan, tv_bagasi, tv_harga, tv_kuotaPesawat;
//        ImageView iv_Maskapai;
        ConstraintLayout c_layout_pesawat;

        public PesawatViewHolder(View itemView) {
            super(itemView);
            tv_namaMaskapai = itemView.findViewById(R.id.tv_namaMaskapai);
//            iv_Maskapai = itemView.findViewById(R.id.iv_logoMaskapai);
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
