package com.esercitazionePreTest.model.materiale;

public class Libro implements Materiale{
    private String autore;
    private String casaEditrice;
    private String genere; /* (NARRATIVA, SAGGIO, TECNICO) */
    private int ISBN;
    private int numPagine;

    public Libro() {
    }
    public Libro(String autore, String casaEditrice, String genere, int ISBN, int numPagine) {
        this.autore = autore;
        this.casaEditrice = casaEditrice;
        this.genere = genere;
        this.ISBN = ISBN;
        this.numPagine = numPagine;
    }

    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public String getCasaEditrice() {
        return casaEditrice;
    }
    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice;
    }
    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public int getNumPagine() {
        return numPagine;
    }
    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }

    @Override
    public String getCodice() {
        return "";
    }
    @Override
    public String getTitolo() {
        return "";
    }
    @Override
    public boolean isDisponibile() {
        return false;
    }
    @Override
    public void prendiInPrestito() {
    }
    @Override
    public void restituisci() {
    }
    @Override
    public int getDurataPrestitoGiorni() {
        return 0;
    }
    @Override
    public String getCategoria() {
        return "";
    }
}
