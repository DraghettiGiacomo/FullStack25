package com.esercitazionePreTest.model.utente;

import com.esercitazionePreTest.model.Prestito;

import java.time.LocalDate;
import java.util.List;

public abstract class Utente {
    private String codiceUtente;
    private String nome;
    private String email;
    private LocalDate dataIscrizione;
    private List<Prestito> storicoRestiti;
    private double saldoPenali;

    public Utente() {}

    public String getCodiceUtente() {
        return codiceUtente;
    }
    public void setCodiceUtente(String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDataIscrizione() {
        return dataIscrizione;
    }
    public void setDataIscrizione(LocalDate dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }
    public List<Prestito> getStoricoRestiti() {
        return storicoRestiti;
    }
    public void setStoricoRestiti(List<Prestito> storicoRestiti) {
        this.storicoRestiti = storicoRestiti;
    }
    public double getSaldoPenali() {
        return saldoPenali;
    }
    public void setSaldoPenali(double saldoPenali) {
        this.saldoPenali = saldoPenali;
    }

    public abstract int getMaxPrestitiContemporanei();

    public abstract double getSconto();
}

