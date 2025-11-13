package com.esercitazionePreTest.model.utente;

public class UtentePremium extends Utente{
    @Override
    public int getMaxPrestitiContemporanei() {
        return 7;
    }
    @Override
    public double getSconto() {
        return 50;
    }
}
