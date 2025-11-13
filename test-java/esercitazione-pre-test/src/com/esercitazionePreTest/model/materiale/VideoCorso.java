package com.esercitazionePreTest.model.materiale;

public class VideoCorso implements Materiale{
    private String istruttore;
    private int numeroLezioni;
    private int durataOre;
    private String livello; /* (PRINCIPIANTE, INTERMEDIO, AVANZATO) */

    public VideoCorso() {}
    public VideoCorso(int numeroLezioni, String istruttore, int durataOre, String livello) {
        this.numeroLezioni = numeroLezioni;
        this.istruttore = istruttore;
        this.durataOre = durataOre;
        this.livello = livello;
    }

    public String getIstruttore() {
        return istruttore;
    }
    public void setIstruttore(String istruttore) {
        this.istruttore = istruttore;
    }
    public int getNumeroLezioni() {
        return numeroLezioni;
    }
    public void setNumeroLezioni(int numeroLezioni) {
        this.numeroLezioni = numeroLezioni;
    }
    public int getDurataOre() {
        return durataOre;
    }
    public void setDurataOre(int durataOre) {
        this.durataOre = durataOre;
    }
    public String getLivello() {
        return livello;
    }
    public void setLivello(String livello) {
        this.livello = livello;
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
