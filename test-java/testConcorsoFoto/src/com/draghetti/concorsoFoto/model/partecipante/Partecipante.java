package com.draghetti.concorsoFoto.model.partecipante;

import java.io.Serializable;

public abstract class Partecipante implements Serializable {

    private long id;
    private String nome;
    private int punteggio;

    public Partecipante(long id, String nome) {
        this.id = id;
        this.nome = nome;
        this.punteggio = 0;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPunteggio() {
        return punteggio;
    }
    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public void aggiungiPunti(int punti) {
        this.punteggio += punti;
    }
    public abstract String getDescrizione(); //ritorno i dettagli delle sottoclassi (Fotografo/Collettivo)

    @Override
    public String toString() {
        return nome + " (punteggio: " + punteggio + ")";
    }
}
