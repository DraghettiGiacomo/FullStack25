package com.esercitazionePreTest.model.penale;

import com.esercitazionePreTest.model.materiale.Materiale;

public class PenaleStandard implements StrategiaPenale{
    @Override
    public double calcolaPenale(int giorniRitardo, Materiale materiale) {
        return giorniRitardo * 0.50;
    }
    @Override
    public String getDescrizione() {
        return "penale standard";
    }
}
