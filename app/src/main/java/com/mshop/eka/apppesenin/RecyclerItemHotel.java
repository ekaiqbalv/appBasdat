package com.mshop.eka.apppesenin;

public class RecyclerItemHotel {
    private int id,gambar;
    private String judul,Rating,Lokasi,Harga;

    public RecyclerItemHotel(int id, int gambar, String judul, String rating, String lokasi, String harga) {
        this.id = id;
        this.gambar = gambar;
        this.judul = judul;
        Rating = rating;
        Lokasi = lokasi;
        Harga = harga;
    }

    public int getId() {
        return id;
    }

    public int getGambar() {
        return gambar;
    }

    public String getJudul() {
        return judul;
    }

    public String getRating() {
        return Rating;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public String getHarga() {
        return Harga;
    }
}
