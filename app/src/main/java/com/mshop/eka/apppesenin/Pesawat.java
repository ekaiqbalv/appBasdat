package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class Pesawat implements Serializable {
    private int id_pesawat,imageMaskapai;
    private String nama_Maskapai,waktuBerangkat,waktuSampai,kotaAsal,bandaraAsal,bandaraAsalSingkat,terminalAsal,kotaTujuan,bandaraTujuan,
            bandaraTujuanSingkat,terminalTujuan,nomorPenerbangan,durasi, jenisPesawat, layoutKursi, jarakKursi, kabin, bagasi, kuota, harga;

    public Pesawat(int id_pesawat, int imageMaskapai, String nama_Maskapai, String waktuBerangkat, String waktuSampai,
                   String kotaAsal, String bandaraAsal,String bandaraAsalSingkat,String terminalAsal, String kotaTujuan, String bandaraTujuan,
                   String bandaraTujuanSingkat, String terminalTujuan, String nomorPenerbangan, String durasi, String jenisPesawat, String layoutKursi,
                   String jarakKursi, String kabin, String bagasi, String kuota, String harga) {
        this.id_pesawat = id_pesawat;
        this.imageMaskapai = imageMaskapai;
        this.nama_Maskapai = nama_Maskapai;
        this.waktuBerangkat = waktuBerangkat;
        this.waktuSampai = waktuSampai;
        this.kotaAsal = kotaAsal;
        this.bandaraAsal = bandaraAsal;
        this.bandaraAsalSingkat = bandaraAsalSingkat;
        this.terminalAsal = terminalAsal;
        this.kotaTujuan = kotaTujuan;
        this.bandaraTujuan = bandaraTujuan;
        this.bandaraTujuanSingkat = bandaraTujuanSingkat;
        this.terminalTujuan = terminalTujuan;
        this.nomorPenerbangan = nomorPenerbangan;
        this.durasi = durasi;
        this.jenisPesawat = jenisPesawat;
        this.layoutKursi = layoutKursi;
        this.jarakKursi = jarakKursi;
        this.kabin = kabin;
        this.bagasi = bagasi;
        this.kuota = kuota;
        this.harga = harga;
    }

    public int getId_pesawat() {
        return id_pesawat;
    }

    public int getImageMaskapai() {
        return imageMaskapai;
    }

    public String getNama_Maskapai() {
        return nama_Maskapai;
    }

    public String getWaktuBerangkat() {
        return waktuBerangkat;
    }

    public String getWaktuSampai() { return waktuSampai; }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public String getBandaraAsal() {
        return bandaraAsal;
    }

    public String getBandaraAsalSingkat() { return bandaraAsalSingkat; }

    public String getTerminalAsal() { return terminalAsal; }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getBandaraTujuanSingkat() { return bandaraTujuanSingkat; }

    public String getTerminalTujuan() { return terminalTujuan; }

    public String getNomorPenerbangan() { return nomorPenerbangan; }

    public String getDurasi() {
        return durasi;
    }

    public String getJenisPesawat() {
        return jenisPesawat;
    }

    public String getLayoutKursi() {
        return layoutKursi;
    }

    public String getJarakKursi() {
        return jarakKursi;
    }

    public String getKabin() {
        return kabin;
    }

    public String getBagasi() {
        return bagasi;
    }

    public String getKuota() {
        return kuota;
    }

    public String getHarga() {
        return harga;
    }
}
