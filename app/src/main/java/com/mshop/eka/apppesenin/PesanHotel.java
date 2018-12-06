package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class PesanHotel implements Serializable {
    private int idTransaksi, idKamar,idPemesan, idPembayaran;

    public PesanHotel(int idTransaksi, int idKamar, int idPemesan, int idPembayaran) {
        this.idTransaksi = idTransaksi;
        this.idKamar = idKamar;
        this.idPemesan = idPemesan;
        this.idPembayaran = idPembayaran;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdKamar() {
        return idKamar;
    }

    public void setIdKamar(int idKamar) {
        this.idKamar = idKamar;
    }

    public int getIdPemesan() {
        return idPemesan;
    }

    public void setIdPemesan(int idPemesan) {
        this.idPemesan = idPemesan;
    }

    public int getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }
}
