package com.mshop.eka.apppesenin;

public class PesanAktif {
    int idTransaksi;
    String namaPemesan, namaPesanan, lokasiAtauJam, tglPesanan, dekripsiPesanan1, deskripsiPesanan2, hargaPesanan;

    public PesanAktif() {
    }

    public PesanAktif(int idTransaksi, String namaPemesan, String namaPesanan, String lokasiAtauJam, String tglPesanan, String dekripsiPesanan1, String deskripsiPesanan2, String hargaPesanan) {
        this.idTransaksi = idTransaksi;
        this.namaPemesan = namaPemesan;
        this.namaPesanan = namaPesanan;
        this.lokasiAtauJam = lokasiAtauJam;
        this.tglPesanan = tglPesanan;
        this.dekripsiPesanan1 = dekripsiPesanan1;
        this.deskripsiPesanan2 = deskripsiPesanan2;
        this.hargaPesanan = hargaPesanan;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getNamaPemesan() { return namaPemesan; }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public String getNamaPesanan() {
        return namaPesanan;
    }

    public void setNamaPesanan(String namaPesanan) {
        this.namaPesanan = namaPesanan;
    }

    public String getLokasiAtauJam() {
        return lokasiAtauJam;
    }

    public void setLokasiAtauJam(String lokasiAtauJam) {
        this.lokasiAtauJam = lokasiAtauJam;
    }

    public String getTglPesanan() {
        return tglPesanan;
    }

    public void setTglPesanan(String tglPesanan) {
        this.tglPesanan = tglPesanan;
    }

    public String getDekripsiPesanan1() {
        return dekripsiPesanan1;
    }

    public void setDekripsiPesanan1(String dekripsiPesanan1) { this.dekripsiPesanan1 = dekripsiPesanan1; }

    public String getDeskripsiPesanan2() {
        return deskripsiPesanan2;
    }

    public void setDeskripsiPesanan2(String deskripsiPesanan2) { this.deskripsiPesanan2 = deskripsiPesanan2; }

    public String getHargaPesanan() {
        return hargaPesanan;
    }

    public void setHargaPesanan(String hargaPesanan) {
        this.hargaPesanan = hargaPesanan;
    }
}