package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class PembayaranPesawat implements Serializable {
    int idTransaksi;
    String totalTagihan, namaBank, nomorRekening, namaRekening;

    public PembayaranPesawat(int idTransaksi, String totalTagihan, String namaBank, String nomorRekening, String namaRekening) {
        this.idTransaksi = idTransaksi;
        this.totalTagihan = totalTagihan;
        this.namaBank = namaBank;
        this.nomorRekening = nomorRekening;
        this.namaRekening = namaRekening;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getTotalTagihan() {
        return totalTagihan;
    }

    public void setTotalTagihan(String totalTagihan) {
        this.totalTagihan = totalTagihan;
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

    public String getNamaRekening() {
        return namaRekening;
    }

    public void setNamaRekening(String namaRekening) {
        this.namaRekening = namaRekening;
    }
}
