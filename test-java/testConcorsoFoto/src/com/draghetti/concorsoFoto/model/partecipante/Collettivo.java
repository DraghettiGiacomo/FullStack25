package com.draghetti.concorsoFoto.model.partecipante;

import java.util.List;

public class Collettivo extends Partecipante {
    private List<Fotografo> membri;

    public Collettivo(long id, String nomeGruppo, List<Fotografo> membri) {
        super(id, nomeGruppo);
        this.membri = membri;
    }

    public List<Fotografo> getMembri() {
        return membri;
    }
    public void setMembri(List<Fotografo> membri) {
        this.membri = membri;
    }

    @Override
    public String getDescrizione() {
        return "Collettivo: " + getNome() + " con " + membri.size() + " fotografi";
    }
}
