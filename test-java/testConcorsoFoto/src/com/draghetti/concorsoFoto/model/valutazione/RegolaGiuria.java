package com.draghetti.concorsoFoto.model.valutazione;

import com.draghetti.concorsoFoto.model.Foto;
import com.draghetti.concorsoFoto.model.partecipante.Partecipante;

public class RegolaGiuria implements Valutazione {
    @Override
    public void applicaEvento(Foto foto, String tipoEvento) {
        Partecipante autore = foto.getAutore();

        switch(tipoEvento) {
            case "voto3":
                autore.aggiungiPunti(3);
                break;
            case "voto2":
                autore.aggiungiPunti(2);
                break;
            case "voto1":
                autore.aggiungiPunti(1);
                break;
        }
    }
}
