package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class CariHotel implements Serializable {
    private int idCari;
    private String lokasiHotel, tanggalInap, durasiInap;

    public CariHotel(int idCari, String lokasiHotel, String tanggalInap, String durasiInap) {
        this.idCari = idCari;
        this.lokasiHotel = lokasiHotel;
        this.tanggalInap = tanggalInap;
        this.durasiInap = durasiInap;
    }

    public CariHotel() {
    }

    public int getIdCari() {
        return idCari;
    }

    public void setIdCari(int idCari) {
        this.idCari = idCari;
    }

    public String getLokasiHotel() {
        return lokasiHotel;
    }

    public void setLokasiHotel(String lokasiHotel) {
        this.lokasiHotel = lokasiHotel;
    }

    public String getTanggalInap() {
        return tanggalInap;
    }

    public void setTanggalInap(String tanggalInap) {
        this.tanggalInap = tanggalInap;
    }

    public String getDurasiInap() {
        return durasiInap;
    }

    public void setDurasiInap(String durasiInap) {
        this.durasiInap = durasiInap;
    }
}
