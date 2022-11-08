package com.netflix;

public class Film extends Content {
    private String regia;
    private int durata;

    public String getRegia() {
        return regia;
    }

    public void setRegia(String regia) {
        this.regia = regia;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Film{" +
                "regia='" + regia + '\'' +
                ", durata=" + durata +
                '}';
    }
}
