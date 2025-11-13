package com.esercitazionePreTest.model.penale;

import com.esercitazionePreTest.model.materiale.Materiale;

public class PenaleMateriale implements StrategiaPenale{
    @Override
    public double calcolaPenale(int giorniRitardo, Materiale materiale) {
        if (materiale.getCategoria().equals("audioLibro")) return giorniRitardo;
        if (materiale.getCategoria().equals("videoCorsi")) return giorniRitardo * 2;
        return giorniRitardo * 0.50;
    }
    @Override
    public String getDescrizione() {
        return "penale materiale";
    }
}
