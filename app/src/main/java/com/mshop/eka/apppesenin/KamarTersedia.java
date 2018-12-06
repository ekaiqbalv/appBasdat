package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class KamarTersedia implements Serializable {
    private int idKamarTersedia, idKamar;
    private String tanggal, kuota;

    public KamarTersedia(int idKamarTersedia, int idKamar, String tanggal, String kuota) {
        this.idKamarTersedia = idKamarTersedia;
        this.idKamar = idKamar;
        this.tanggal = tanggal;
        this.kuota = kuota;
    }

    public int getIdKamarTersedia() {
        return idKamarTersedia;
    }

    public void setIdKamarTersedia(int idKamarTersedia) {
        this.idKamarTersedia = idKamarTersedia;
    }

    public int getIdKamar() {
        return idKamar;
    }

    public void setIdKamar(int idKamar) {
        this.idKamar = idKamar;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKuota() {
        return kuota;
    }

    public void setKuota(String kuota) {
        this.kuota = kuota;
    }
}