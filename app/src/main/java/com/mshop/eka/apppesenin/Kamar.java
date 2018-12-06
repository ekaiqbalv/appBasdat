package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class Kamar implements Serializable {
    private int idKamar, idHotel;
    private String namaKamar, maksTamu, sarapan, wifi, tanggal, harga;

    public Kamar(int idKamar, int idHotel, String namaKamar, String maksTamu, String sarapan, String wifi, String tanggal ,String harga) {
        this.idKamar = idKamar;
        this.idHotel = idHotel;
        this.namaKamar = namaKamar;
        this.maksTamu = maksTamu;
        this.sarapan = sarapan;
        this.wifi = wifi;
        this.tanggal = tanggal;
        this.harga = harga;
    }

    public int getIdKamar() {
        return idKamar;
    }

    public void setIdKamar(int idKamar) {
        this.idKamar = idKamar;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNamaKamar() {
        return namaKamar;
    }

    public void setNamaKamar(String namaKamar) {
        this.namaKamar = namaKamar;
    }

    public String getMaksTamu() {
        return maksTamu;
    }

    public void setMaksTamu(String maksTamu) {
        this.maksTamu = maksTamu;
    }

    public String getSarapan() {
        return sarapan;
    }

    public void setSarapan(String sarapan) {
        this.sarapan = sarapan;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}