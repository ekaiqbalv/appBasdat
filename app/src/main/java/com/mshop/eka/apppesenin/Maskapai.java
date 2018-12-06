package com.mshop.eka.apppesenin;

import java.io.Serializable;

public class Maskapai implements Serializable {
    private String kodeMaskapai, namaMaskapai;

    public Maskapai(String kodeMaskapai, String namaMaskapai) {
        this.kodeMaskapai = kodeMaskapai;
        this.namaMaskapai = namaMaskapai;
    }

    public String getKodeMaskapai() {
        return kodeMaskapai;
    }

    public void setKodeMaskapai(String kodeMaskapai) {
        this.kodeMaskapai = kodeMaskapai;
    }

    public String getNamaMaskapai() {
        return namaMaskapai;
    }

    public void setNamaMaskapai(String namaMaskapai) {
        this.namaMaskapai = namaMaskapai;
    }
}
