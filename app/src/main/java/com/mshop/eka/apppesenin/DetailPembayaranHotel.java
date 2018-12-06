package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class DetailPembayaranHotel implements Serializable {
    private int idTransaksi;
    private String namaBank, nomorRekening, namaPemilikRekening;

    public DetailPembayaranHotel(int idTransaksi, String namaBank, String nomorRekening, String namaPemilikRekening) {
        this.idTransaksi = idTransaksi;
        this.namaBank = namaBank;
        this.nomorRekening = nomorRekening;
        this.namaPemilikRekening = namaPemilikRekening;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
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
