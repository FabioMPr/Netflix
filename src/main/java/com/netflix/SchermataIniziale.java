package com.netflix;

public class SchermataIniziale {
    private String titoloContenuto;
    private boolean logged;


    public String getTitoloContenuto() {
        return titoloContenuto;
    }

    public void setTitoloContenuto(String titoloContenuto) {
        this.titoloContenuto = titoloContenuto;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    @Override
    public String toString() {
        return "SchermataIniziale{" +
                "titoloContenuto='" + titoloContenuto + '\'' +
                ", logged=" + logged +
                '}';
    }

    public void interagisce(boolean logged) {
        //richiamo del metodo  riproducifilm() passando il codice ritornato da bin
    }

    public void bin(String titoloContenuto){
        //risolvo il titolo del contenuto passato dall'utente
    }

}
