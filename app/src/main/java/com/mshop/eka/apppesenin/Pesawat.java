package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class Pesawat implements Serializable {
    private int idPesawat;
    private String kodeMaskapai, jenisPesawat, layoutKursi, jarakKursi, penyimpananKabin, penyimpananBagasi, maksimalPenumpang;

    public Pesawat(int idPesawat, String kodeMaskapai, String jenisPesawat, String layoutKursi, String jarakKursi, String penyimpananKabin, String penyimpananBagasi, String maksimalPenumpang) {
        this.idPesawat = idPesawat;
        this.kodeMaskapai = kodeMaskapai;
        this.jenisPesawat = jenisPesawat;
        this.layoutKursi = layoutKursi;
        this.jarakKursi = jarakKursi;
        this.penyimpananKabin = penyimpananKabin;
        this.penyimpananBagasi = penyimpananBagasi;
        this.maksimalPenumpang = maksimalPenumpang;
    }

    public int getIdPesawat() {
        return idPesawat;
    }

    public void setIdPesawat(int idPesawat) {
        this.idPesawat = idPesawat;
    }

    public String getKodeMaskapai() {
        return kodeMaskapai;
    }

    public void setKodeMaskapai(String kodeMaskapai) {
        this.kodeMaskapai = kodeMaskapai;
    }

    public String getJenisPesawat() {
        return jenisPesawat;
    }

    public void setJenisPesawat(String jenisPesawat) {
        this.jenisPesawat = jenisPesawat;
    }

    public String getLayoutKursi() {
        return layoutKursi;
    }

    public void setLayoutKursi(String layoutKursi) {
        this.layoutKursi = layoutKursi;
    }

    public String getJarakKursi() {
        return jarakKursi;
    }

    public void setJarakKursi(String jarakKursi) {
        this.jarakKursi = jarakKursi;
    }

    public String getPenyimpananKabin() {
        return penyimpananKabin;
    }

    public void setPenyimpananKabin(String penyimpananKabin) {
        this.penyimpananKabin = penyimpananKabin;
    }

    public String getPenyimpananBagasi() {
        return penyimpananBagasi;
    }

    public void setPenyimpananBagasi(String penyimpananBagasi) {
        this.penyimpananBagasi = penyimpananBagasi;
    }

    public String getMaksimalPenumpang() {
        return maksimalPenumpang;
    }

    public void setMaksimalPenumpang(String maksimalPenumpang) {
        this.maksimalPenumpang = maksimalPenumpang;
    }
}
