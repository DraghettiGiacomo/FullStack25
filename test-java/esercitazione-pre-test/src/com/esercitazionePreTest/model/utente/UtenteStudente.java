package com.esercitazionePreTest.model.utente;

public class UtenteStudente extends Utente{
    @Override
    public int getMaxPrestitiContemporanei() {
        return 5;
    }
    @Override
    public double getSconto() {
        return 30;
    }
}
