package com.draghetti.concorsoFoto.model.valutazione;

import com.draghetti.concorsoFoto.model.Foto;

public class RegolaMista implements Valutazione{
    private Valutazione pop = new RegolaPopolarita();
    private Valutazione giuria = new RegolaGiuria();

    @Override
    public void applicaEvento(Foto foto, String tipoEvento) {
        // metà punti dalla popolarità, metà dalla giuria
        pop.applicaEvento(foto, tipoEvento);
        giuria.applicaEvento(foto, tipoEvento);
    }
}
