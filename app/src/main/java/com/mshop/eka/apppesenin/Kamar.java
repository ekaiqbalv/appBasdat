package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class Kamar implements Serializable {
    private int id;
    private String judul,makstamu,fasilitas1,fasilitas2,harga;

    public Kamar(int id, String judul, String makstamu, String fasilitas1, String fasilitas2, String harga) {
        this.id = id;
        this.judul = judul;
        this.makstamu = makstamu;
        this.fasilitas1 = fasilitas1;
        this.fasilitas2 = fasilitas2;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getMakstamu() {
        return makstamu;
    }

    public String getFasilitas1() {
        return fasilitas1;
    }

    public String getFasilitas2() {
        return fasilitas2;
    }

    public String getHarga() {
        return harga;
    }
}
