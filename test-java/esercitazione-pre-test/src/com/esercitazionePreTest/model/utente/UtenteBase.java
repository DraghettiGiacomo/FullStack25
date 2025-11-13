package com.esercitazionePreTest.model.utente;

public class UtenteBase extends Utente{
    @Override
    public int getMaxPrestitiContemporanei() {
        return 3;
    }
    @Override
    public double getSconto() {
        return 0;
    }
}
