package com.netflix;

public class Serie extends Content{
    private String regista;
    private int episodi;
    private int stagioni;

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public int getEpisodi() {
        return episodi;
    }

    public void setEpisodi(int episodi) {
        this.episodi = episodi;
    }

    public int getStagioni() {
        return stagioni;
    }

    public void setStagioni(int stagioni) {
        this.stagioni = stagioni;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "regista='" + regista + '\'' +
                ", episodi=" + episodi +
                ", stagioni=" + stagioni +
                '}';
    }
}
