package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class CariPesawat implements Serializable {
    private int idCari;
    private String kotaKeberangkatan, kotaKedatangan, tanggalPenerbangan, jumlahPenumpang;

    public CariPesawat() {
    }

    public CariPesawat(int idCari, String kotaKeberangkatan, String kotaKedatangan, String tanggalPenerbangan, String jumlahPenumpang) {
        this.idCari = idCari;
        this.kotaKeberangkatan = kotaKeberangkatan;
        this.kotaKedatangan = kotaKedatangan;
        this.tanggalPenerbangan = tanggalPenerbangan;
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public int getIdCari() {
        return idCari;
    }

    public void setIdCari(int idCari) {
        this.idCari = idCari;
    }

    public String getKotaKeberangkatan() {
        return kotaKeberangkatan;
    }

    public void setKotaKeberangkatan(String kotaKeberangkatan) {
        this.kotaKeberangkatan = kotaKeberangkatan;
    }

    public String getKotaKedatangan() {
        return kotaKedatangan;
    }

    public void setKotaKedatangan(String kotaKedatangan) {
        this.kotaKedatangan = kotaKedatangan;
    }

    public String getTanggalPenerbangan() {
        return tanggalPenerbangan;
    }

    public void setTanggalPenerbangan(String tanggalPenerbangan) {
        this.tanggalPenerbangan = tanggalPenerbangan;
    }

    public String getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(String jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }
}
