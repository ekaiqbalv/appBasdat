package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class PesanPesawat implements Serializable {
    private int idTransaksi,idPemesan,idPembayaran;
    private String kodePenerbangan;

    public PesanPesawat(int idTransaksi, int idPemesan, int idPembayaran, String kodePenerbangan) {
        this.idTransaksi = idTransaksi;
        this.idPemesan = idPemesan;
        this.idPembayaran = idPembayaran;
        this.kodePenerbangan = kodePenerbangan;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
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

    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public void setKodePenerbangan(String kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
    }
}
