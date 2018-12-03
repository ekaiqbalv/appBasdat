package com.mshop.eka.apppesenin;

import java.io.Serializable;
import java.util.ArrayList;

public class Hotel implements Serializable {
    private int idHotel,gambar;
    private String namaHotel,rating,lokasiDaerah,lokasiKota, harga;
    private ArrayList<Kamar> kamarList;

    public Hotel(int idHotel, int gambar, String namaHotel, String rating, String lokasiDaerah, String lokasiKota, String harga) {
        this.idHotel = idHotel;
        this.gambar = gambar;
        this.namaHotel = namaHotel;
        this.rating = rating;
        this.lokasiDaerah = lokasiDaerah;
        this.lokasiKota = lokasiKota;
        this.harga = harga;
        kamarList = new ArrayList<>();
    }

    public int getIdHotel() {
        return idHotel;
    }

    public int getGambar() { return gambar; }

    public String getNamaHotel() { return namaHotel; }

    public String getRating() {
        return rating;
    }

    public String getLokasiDaerah() {
        return lokasiDaerah;
    }

    public String getLokasiKota() {
        return lokasiKota;
    }

    public String getHarga() {
        return harga;
    }

    void addKamar (Kamar kamar){ kamarList.add(kamar); }

    void setKamar(ArrayList<Kamar> kamarList){ this.kamarList = kamarList; }

    public ArrayList<Kamar> getKamarList() {
        return kamarList;
    }
}
