package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class Kamar implements Serializable {
    private int idKamar;
    private String namaKamar, makstamu, sarapan, wifi,harga, tanggal, kuota;

    public Kamar(int idKamar, String namaKamar, String makstamu, String sarapan, String wifi, String harga, String tanggal, String kuota) {
        this.idKamar = idKamar;
        this.namaKamar = namaKamar;
        this.makstamu = makstamu;
        this.sarapan = sarapan;
        this.wifi = wifi;
        this.harga = harga;
        this.tanggal = tanggal;
        this.kuota = kuota;
    }

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

    public String getTanggal() { return tanggal; }

    public String getKuota() { return kuota; }
}
