package com.draghetti.concorsoFoto.model;

import com.draghetti.concorsoFoto.model.partecipante.Partecipante;

import java.io.Serializable;
import java.time.LocalDate;

public class Foto implements Serializable {
    private long id;
    private String title;
    private String descrizione;
    private LocalDate dataInvio;
    private Partecipante autore;

    public Foto(long id, String titolo, Partecipante autore) {
        this.id = id;
        this.title = titolo;
        this.autore = autore;
        this.dataInvio = LocalDate.now();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public LocalDate getDataInvio() {
        return dataInvio;
    }
    public void setDataInvio(LocalDate dataInvio) {
        this.dataInvio = dataInvio;
    }
    public Partecipante getAutore() {
        return autore;
    }
    public void setAutore(Partecipante autore) {
        this.autore = autore;
    }

    @Override
    public String toString() {
        return "Foto:" +
                "title='" + title + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", dataInvio=" + dataInvio +
                ", autore=" + autore;
    }
}
