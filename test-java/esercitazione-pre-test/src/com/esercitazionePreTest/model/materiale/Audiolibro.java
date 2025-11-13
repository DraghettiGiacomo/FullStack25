package com.esercitazionePreTest.model.materiale;

public class Audiolibro implements Materiale{
    private int codice;
    private String titolo;
    private boolean disponibile;
    private String narratore;
    private int durataminuti;
    private String formato; /* (MP3, AAC) */
    private String autoreOriginale;

    public Audiolibro() {
    }
    public Audiolibro(String narratore, int durataminuti, String formato, String autoreOriginale) {
        this.narratore = narratore;
        this.durataminuti = durataminuti;
        this.formato = formato;
        this.autoreOriginale = autoreOriginale;
    }

    public String getNarratore() {
        return narratore;
    }
    public void setNarratore(String narratore) {
        this.narratore = narratore;
    }
    public int getDurataminuti() {
        return durataminuti;
    }
    public void setDurataminuti(int durataminuti) {
        this.durataminuti = durataminuti;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public String getAutoreOriginale() {
        return autoreOriginale;
    }
    public void setAutoreOriginale(String autoreOriginale) {
        this.autoreOriginale = autoreOriginale;
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
