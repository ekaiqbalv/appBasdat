package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class Terminal implements Serializable {
    private int idTerminal, idBandara;
    private String namaTerminal;

    public Terminal(int idTerminal, int idBandara, String namaTerminal) {
        this.idTerminal = idTerminal;
        this.idBandara = idBandara;
        this.namaTerminal = namaTerminal;
    }

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        this.idTerminal = idTerminal;
    }

    public int getIdBandara() {
        return idBandara;
    }

    public void setIdBandara(int idBandara) {
        this.idBandara = idBandara;
    }

    public String getNamaTerminal() {
        return namaTerminal;
    }

    public void setNamaTerminal(String namaTerminal) {
        this.namaTerminal = namaTerminal;
    }
}
