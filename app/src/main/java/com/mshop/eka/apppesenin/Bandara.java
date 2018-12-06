package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class Bandara implements Serializable {
    private int idBandara;
    private String namaBandara,singkatanBandara;

    public Bandara(int idBandara, String namaBandara, String singkatanBandara) {
        this.idBandara = idBandara;
        this.namaBandara = namaBandara;
        this.singkatanBandara = singkatanBandara;
    }

    public int getIdBandara() {
        return idBandara;
    }

    public void setIdBandara(int idBandara) {
        this.idBandara = idBandara;
    }

    public String getNamaBandara() {
        return namaBandara;
    }

    public void setNamaBandara(String namaBandara) {
        this.namaBandara = namaBandara;
    }

    public String getSingkatanBandara() {
        return singkatanBandara;
    }

    public void setSingkatanBandara(String singkatanBandara) {
        this.singkatanBandara = singkatanBandara;
    }
}