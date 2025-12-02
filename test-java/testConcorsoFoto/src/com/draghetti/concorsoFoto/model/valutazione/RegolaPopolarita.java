package com.draghetti.concorsoFoto.model.valutazione;

import com.draghetti.concorsoFoto.model.Foto;
import com.draghetti.concorsoFoto.model.partecipante.Partecipante;

public class RegolaPopolarita implements Valutazione {
    @Override
    public void applicaEvento(Foto foto, String tipoEvento) {
        Partecipante autore = foto.getAutore();

        switch (tipoEvento) {
            case "like":
                autore.aggiungiPunti(1);
                break;
            case "share":
                autore.aggiungiPunti(3);
                break;
            case "segnalazione":
                autore.aggiungiPunti(-2);
                break;
        }
    }
}
