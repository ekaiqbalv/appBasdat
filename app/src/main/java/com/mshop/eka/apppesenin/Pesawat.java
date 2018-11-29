package com.mshop.eka.apppesenin;

public class Pesawat {
    private int id_pesawat,imageMaskapai;
    private String Nama_Maskapai,WaktuBrangkat,WaktuSampai,Asal,Tujuan,Harga;

    public Pesawat(int id_pesawat, int imageMaskapai, String nama_Maskapai, String waktuBrangkat, String waktuSampai, String asal, String tujuan, String harga) {
        this.id_pesawat = id_pesawat;
        this.imageMaskapai = imageMaskapai;
        Nama_Maskapai = nama_Maskapai;
        WaktuBrangkat = waktuBrangkat;
        WaktuSampai = waktuSampai;
        Asal = asal;
        Tujuan = tujuan;
        Harga = harga;
    }

    public int getId_pesawat() {
        return id_pesawat;
    }

    public int getImageMaskapai() {
        return imageMaskapai;
    }

    public String getNama_Maskapai() {
        return Nama_Maskapai;
    }

    public String getWaktuBrangkat() {
        return WaktuBrangkat;
    }

    public String getWaktuSampai() {
        return WaktuSampai;
    }

    public String getAsal() {
        return Asal;
    }

    public String getTujuan() {
        return Tujuan;
    }

    public String getHarga() {
        return Harga;
    }
}
