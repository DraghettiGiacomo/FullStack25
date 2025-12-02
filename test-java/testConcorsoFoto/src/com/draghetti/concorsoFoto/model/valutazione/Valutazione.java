package com.draghetti.concorsoFoto.model.valutazione;

import com.draghetti.concorsoFoto.model.Foto;

public interface Valutazione {
    void applicaEvento(Foto foto, String tipoEvento);
}
