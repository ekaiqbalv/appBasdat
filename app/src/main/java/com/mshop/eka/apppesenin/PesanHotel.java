package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class PesanHotel implements Serializable {
    int idTransaksi;
    String lokasiKota, tanggal, durasi, namaPemesan, nomoHp, email,totalBiaya;

    public PesanHotel() {
    }

    public PesanHotel(int idTransaksi, String lokasiKota, String tanggal, String durasi) {
        this.idTransaksi = idTransaksi;
        this.lokasiKota = lokasiKota;
        this.tanggal = tanggal;
        this.durasi = durasi;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getLokasiKota() { return lokasiKota; }

    public void setLokasiKota(String lokasiKota) {
        this.lokasiKota = lokasiKota;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getDurasi() { return durasi; }

    public void setDurasi(String durasi) { this.durasi = durasi; }

    public String getNamaPemesan() { return namaPemesan; }

    public void setNamaPemesan(String namaPemesan) { this.namaPemesan = namaPemesan; }

    public String getNomoHp() { return nomoHp; }

    public void setNomoHp(String nomoHp) { this.nomoHp = nomoHp; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getTotalBiaya() { return totalBiaya; }

    public void setTotalBiaya(String totalBiaya) { this.totalBiaya = totalBiaya; }
}
