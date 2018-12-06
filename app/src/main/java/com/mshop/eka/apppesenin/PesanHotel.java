package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class PesanHotel implements Serializable {
    private int idTransaksi, idKamarTersedia,idPemesan, idPembayaran;

    public PesanHotel(int idTransaksi, int idKamarTersedia, int idPemesan, int idPembayaran) {
        this.idTransaksi = idTransaksi;
        this.idKamarTersedia = idKamarTersedia;
        this.idPemesan = idPemesan;
        this.idPembayaran = idPembayaran;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdKamarTersedia() {
        return idKamarTersedia;
    }

    public void setIdKamarTersedia(int idKamarTersedia) {
        this.idKamarTersedia = idKamarTersedia;
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
