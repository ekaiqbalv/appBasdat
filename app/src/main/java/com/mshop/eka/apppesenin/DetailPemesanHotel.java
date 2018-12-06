package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class DetailPemesanHotel implements Serializable {
    private int idPemesan;
    private String namaPemesan, nomorHpPemesan, emailPemesan;

    public DetailPemesanHotel(int idPemesan, String namaPemesan, String nomorHpPemesan, String emailPemesan) {
        this.idPemesan = idPemesan;
        this.namaPemesan = namaPemesan;
        this.nomorHpPemesan = nomorHpPemesan;
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

    public String getNomorHpPemesan() {
        return nomorHpPemesan;
    }

    public void setNomorHpPemesan(String nomorHpPemesan) {
        this.nomorHpPemesan = nomorHpPemesan;
    }

    public String getEmailPemesan() {
        return emailPemesan;
    }

    public void setEmailPemesan(String emailPemesan) {
        this.emailPemesan = emailPemesan;
    }
}
