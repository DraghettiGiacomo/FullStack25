package com.esercitazionePreTest.model.penale;

import com.esercitazionePreTest.model.materiale.Materiale;

public class PenaleProgressiva implements StrategiaPenale{
    @Override
    public double calcolaPenale(int giorniRitardo, Materiale materiale) {
        if (giorniRitardo >= 30) return giorniRitardo * 2;
        if (giorniRitardo <= 7) return giorniRitardo * 0.30;
        return giorniRitardo * 0.80;
    }
    @Override
    public String getDescrizione() {
        return "penale progressiva";
    }
}
