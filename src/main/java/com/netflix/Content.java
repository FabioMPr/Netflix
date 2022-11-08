package com.netflix;

import java.util.Date;

public class Content {
    private String titolo;
    private Date anno;
    private String genere;
    private int compatibilita;

    private String info;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getAnno() {
        return anno;
    }

    public void setAnno(Date anno) {
        this.anno = anno;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getCompatibilita() {
        return compatibilita;
    }

    public void setCompatibilita(int compatibilita) {
        this.compatibilita = compatibilita;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Content{" +
                "titolo='" + titolo + '\'' +
                ", anno=" + anno +
                ", genere='" + genere + '\'' +
                ", compatibilita=" + compatibilita +
                ", info='" + info + '\'' +
                '}';
    }
}
