package com.mshop.eka.apppesenin;

import java.io.Serializable;
import java.util.ArrayList;

public class Hotel implements Serializable {
    private int idHotel, gambarHotel;
    private String namaHotel, bintangHotel, lokasiDaerah, lokasiKota, deskripsiHotel, fasilitasHotel;
    private ArrayList<Kamar> kamarList;

    public Hotel(int idHotel, int gambarHotel, String namaHotel, String bintangHotel, String lokasiDaerah, String lokasiKota, String deskripsiHotel, String fasilitasHotel) {
        this.idHotel = idHotel;
        this.gambarHotel = gambarHotel;
        this.namaHotel = namaHotel;
        this.bintangHotel = bintangHotel;
        this.lokasiDaerah = lokasiDaerah;
        this.lokasiKota = lokasiKota;
        this.deskripsiHotel = deskripsiHotel;
        this.fasilitasHotel = fasilitasHotel;
        kamarList = new ArrayList<>();
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public int getGambarHotel() {
        return gambarHotel;
    }

    public void setGambarHotel(int gambarHotel) {
        this.gambarHotel = gambarHotel;
    }

    public String getNamaHotel() {
        return namaHotel;
    }

    public void setNamaHotel(String namaHotel) {
        this.namaHotel = namaHotel;
    }

    public String getBintangHotel() {
        return bintangHotel;
    }

    public void setBintangHotel(String bintangHotel) {
        this.bintangHotel = bintangHotel;
    }

    public String getLokasiDaerah() {
        return lokasiDaerah;
    }

    public void setLokasiDaerah(String lokasiDaerah) {
        this.lokasiDaerah = lokasiDaerah;
    }

    public String getLokasiKota() {
        return lokasiKota;
    }

    public void setLokasiKota(String lokasiKota) {
        this.lokasiKota = lokasiKota;
    }

    public String getDeskripsiHotel() {
        return deskripsiHotel;
    }

    public void setDeskripsiHotel(String deskripsiHotel) {
        this.deskripsiHotel = deskripsiHotel;
    }

    public String getFasilitasHotel() {
        return fasilitasHotel;
    }

    public void setFasilitasHotel(String fasilitasHotel) {
        this.fasilitasHotel = fasilitasHotel;
    }

    public void setKamarList(ArrayList<Kamar> kamarList) {
        this.kamarList = kamarList;
    }

//    void addKamar (Kamar kamar){ kamarList.add(kamar); }
//
//    void setKamar(ArrayList<Kamar> kamarList){ this.kamarList = kamarList; }

    public ArrayList<Kamar> getKamarList() {
        return kamarList;
    }
}
