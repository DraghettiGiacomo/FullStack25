package com.esercitazionePreTest.model.materiale;

public class Rivista implements Materiale{
    private String editore;
    private String periodicita; /* (SETTIMANALE, MENSILE) */
    private int numeroEdizione;
    private int mese;
    private int anno;

    public Rivista() {
    }
    public Rivista(String editore, String periodicita, int numeroEdizione, int mese, int anno) {
        this.editore = editore;
        this.periodicita = periodicita;
        this.numeroEdizione = numeroEdizione;
        this.mese = mese;
        this.anno = anno;
    }

    public String getEditore() {
        return editore;
    }
    public void setEditore(String editore) {
        this.editore = editore;
    }
    public String getPeriodicita() {
        return periodicita;
    }
    public void setPeriodicita(String periodicita) {
        this.periodicita = periodicita;
    }
    public int getNumeroEdizione() {
        return numeroEdizione;
    }
    public void setNumeroEdizione(int numeroEdizione) {
        this.numeroEdizione = numeroEdizione;
    }
    public int getMese() {
        return mese;
    }
    public void setMese(int mese) {
        this.mese = mese;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
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
