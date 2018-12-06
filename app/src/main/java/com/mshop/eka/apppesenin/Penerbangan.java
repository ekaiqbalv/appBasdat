package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class Penerbangan implements Serializable {
    private int idPesawat,idTerminalKeberangkatan,idTerminalKedatangan;
    private String kodePenerbangan, tanggalPenerbangan, waktuKeberangkatan, waktuKedatangan, kotaKeberangkatan,
            kotaKedatangan,durasiPenerbangan,harga;

    public Penerbangan(int idPesawat, int idTerminalKeberangkatan, int idTerminalKedatangan, String kodePenerbangan, String tanggalPenerbangan, String waktuKeberangkatan, String waktuKedatangan, String kotaKeberangkatan, String kotaKedatangan, String durasiPenerbangan, String harga) {
        this.idPesawat = idPesawat;
        this.idTerminalKeberangkatan = idTerminalKeberangkatan;
        this.idTerminalKedatangan = idTerminalKedatangan;
        this.kodePenerbangan = kodePenerbangan;
        this.tanggalPenerbangan = tanggalPenerbangan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.kotaKeberangkatan = kotaKeberangkatan;
        this.kotaKedatangan = kotaKedatangan;
        this.durasiPenerbangan = durasiPenerbangan;
        this.harga = harga;
    }

    public int getIdPesawat() {
        return idPesawat;
    }

    public void setIdPesawat(int idPesawat) {
        this.idPesawat = idPesawat;
    }

    public int getIdTerminalKeberangkatan() {
        return idTerminalKeberangkatan;
    }

    public void setIdTerminalKeberangkatan(int idTerminalKeberangkatan) {
        this.idTerminalKeberangkatan = idTerminalKeberangkatan;
    }

    public int getIdTerminalKedatangan() {
        return idTerminalKedatangan;
    }

    public void setIdTerminalKedatangan(int idTerminalKedatangan) {
        this.idTerminalKedatangan = idTerminalKedatangan;
    }

    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public void setKodePenerbangan(String kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
    }

    public String getTanggalPenerbangan() {
        return tanggalPenerbangan;
    }

    public void setTanggalPenerbangan(String tanggalPenerbangan) {
        this.tanggalPenerbangan = tanggalPenerbangan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public void setWaktuKeberangkatan(String waktuKeberangkatan) {
        this.waktuKeberangkatan = waktuKeberangkatan;
    }

    public String getWaktuKedatangan() {
        return waktuKedatangan;
    }

    public void setWaktuKedatangan(String waktuKedatangan) {
        this.waktuKedatangan = waktuKedatangan;
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

    public String getDurasiPenerbangan() {
        return durasiPenerbangan;
    }

    public void setDurasiPenerbangan(String durasiPenerbangan) {
        this.durasiPenerbangan = durasiPenerbangan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
