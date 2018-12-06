package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class DetailPembayaranPesawat implements Serializable {
    private int idPembayaran;
    private String namaBank, nomorRekening, namaPemilikRekening;

    public DetailPembayaranPesawat(int idPembayaran, String namaBank, String nomorRekening, String namaPemilikRekening) {
        this.idPembayaran = idPembayaran;
        this.namaBank = namaBank;
        this.nomorRekening = nomorRekening;
        this.namaPemilikRekening = namaPemilikRekening;
    }

    public int getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public String getNamaPemilikRekening() {
        return namaPemilikRekening;
    }

    public void setNamaPemilikRekening(String namaPemilikRekening) {
        this.namaPemilikRekening = namaPemilikRekening;
    }
}
