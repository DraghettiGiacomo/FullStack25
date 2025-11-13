package com.esercitazionePreTest.model.penale;

import com.esercitazionePreTest.model.materiale.Materiale;

public interface StrategiaPenale {
    double calcolaPenale(int giorniRitardo, Materiale materiale);
    String getDescrizione();
}
