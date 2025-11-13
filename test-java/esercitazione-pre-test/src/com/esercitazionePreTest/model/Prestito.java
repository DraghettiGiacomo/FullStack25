package com.esercitazionePreTest.model;

import com.esercitazionePreTest.model.materiale.Materiale;
import com.esercitazionePreTest.model.penale.StrategiaPenale;
import com.esercitazionePreTest.model.utente.Utente;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestito {
    private String codicePrestito;
    private Materiale materiale;
    private Utente utente;
    private LocalDate dataInizio;
    private LocalDate dataScadenza;
    private LocalDate dataRestituzione;
    private boolean attivo;

    public Prestito() {}
    public Prestito(String codicePrestito, Materiale materiale, Utente utente, LocalDate dataInizio, LocalDate dataScadenza, LocalDate dataRestituzione, boolean attivo) {
        this.codicePrestito = codicePrestito;
        this.materiale = materiale;
        this.utente = utente;
        this.dataInizio = dataInizio;
        this.dataScadenza = dataScadenza;
        this.dataRestituzione = dataRestituzione;
        this.attivo = attivo;
    }

    public String getCodicePrestito() {
        return codicePrestito;
    }
    public void setCodicePrestito(String codicePrestito) {
        this.codicePrestito = codicePrestito;
    }
    public Materiale getMateriale() {
        return materiale;
    }
    public void setMateriale(Materiale materiale) {
        this.materiale = materiale;
    }
    public Utente getUtente() {
        return utente;
    }
    public void setUtente(Utente utente) {
        this.utente = utente;
    }
    public LocalDate getDataInizio() {
        return dataInizio;
    }
    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }
    public LocalDate getDataScadenza() {
        return dataScadenza;
    }
    public void setDataScadenza(LocalDate dataScadenza) {
        this.dataScadenza = dataScadenza;
    }
    public LocalDate getDataRestituzione() {
        return dataRestituzione;
    }
    public void setDataRestituzione(LocalDate dataRestituzione) {
        this.dataRestituzione = dataRestituzione;
    }
    public boolean isAttivo() {
        return attivo;
    }
    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    public int giorniRitardo(){
        LocalDate dataconfronto = (dataRestituzione != null)? dataRestituzione : LocalDate.now();
        if (dataconfronto.isAfter(dataScadenza)) return (int) ChronoUnit.DAYS.between(dataScadenza, dataconfronto);
        return 0;
    };
    public double penali(StrategiaPenale strategia){
        return strategia.calcolaPenale(giorniRitardo(), getMateriale());
    };
}
