package com.example.restapi;

public class Item {
    private String nev;
    private int mennyiseg;
    private int darab_ar;
    private String kategoria;

    public Item(String nev, int mennyiseg, int darab_ar, String kategoria) {
        this.nev = nev;
        this.mennyiseg = mennyiseg;
        this.darab_ar = darab_ar;
        this.kategoria = kategoria;
    }

    public String getNev() {

        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public int getDarab_ar() {
        return darab_ar;
    }

    public void setDarab_ar(int darab_ar) {
        this.darab_ar = darab_ar;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nev='" + nev + '\'' +
                ", mennyiseg=" + mennyiseg +
                ", darab_ar=" + darab_ar +
                ", kategoria='" + kategoria + '\'' +
                '}';
    }
}
