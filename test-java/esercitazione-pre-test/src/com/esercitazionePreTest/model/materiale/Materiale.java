package com.esercitazionePreTest.model.materiale;

public interface Materiale {
    String getCodice();
    String getTitolo();
    boolean isDisponibile();
    void prendiInPrestito();
    void restituisci();
    int getDurataPrestitoGiorni();
    String getCategoria();
}
