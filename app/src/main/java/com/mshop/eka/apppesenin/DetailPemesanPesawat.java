package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class DetailPemesanPesawat implements Serializable {
    private int idPemesan;
    private String namaPemesan, nomorHPPemesan, emailPemesan;

    public DetailPemesanPesawat(int idPemesan, String namaPemesan, String nomorHPPemesan, String emailPemesan) {
        this.idPemesan = idPemesan;
        this.namaPemesan = namaPemesan;
        this.nomorHPPemesan = nomorHPPemesan;
        this.emailPemesan = emailPemesan;
    }

    public int getIdPemesan() {
        return idPemesan;
    }

    public void setIdPemesan(int idPemesan) {
        this.idPemesan = idPemesan;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public String getNomorHPPemesan() {
        return nomorHPPemesan;
    }

    public void setNomorHPPemesan(String nomorHPPemesan) {
        this.nomorHPPemesan = nomorHPPemesan;
    }

    public String getEmailPemesan() {
        return emailPemesan;
    }

    public void setEmailPemesan(String emailPemesan) {
        this.emailPemesan = emailPemesan;
    }
}