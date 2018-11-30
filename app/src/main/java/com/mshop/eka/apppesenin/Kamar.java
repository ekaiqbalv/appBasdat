package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class Kamar implements Serializable {
    private int idKamar;
    private String namaHotel, namaKamar,makstamu, sarapan, wifi,harga;

    public Kamar(String namaHotel, int idKamar, String namaKamar, String makstamu, String sarapan, String wifi, String harga) {
        this.namaHotel = namaHotel;
        this.idKamar = idKamar;
        this.namaKamar = namaKamar;
        this.makstamu = makstamu;
        this.sarapan = sarapan;
        this.wifi = wifi;
        this.harga = harga;
    }

    public String getNamaHotel() { return namaHotel; }

    public int getIdKamar() {
        return idKamar;
    }

    public String getNamaKamar() {
        return namaKamar;
    }

    public String getMakstamu() {
        return makstamu;
    }

    public String getSarapan() { return sarapan; }

    public String getWifi() {
        return wifi;
    }

    public String getHarga() {
        return harga;
    }
}
