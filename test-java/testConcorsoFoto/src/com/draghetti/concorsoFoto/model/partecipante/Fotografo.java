package com.draghetti.concorsoFoto.model.partecipante;

public class Fotografo extends Partecipante {
    private String paese;
    private int eta;

    public Fotografo(long id, String nomeArte, String paese, int eta) {
        super(id, nomeArte);
        this.paese = paese;
        this.eta = eta;
    }

    public String getPaese() {
        return paese;
    }
    public void setPaese(String paese) {
        this.paese = paese;
    }
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String getDescrizione() {
        return "Fotografo: " + getNome() + ", " + paese + ", " + eta + " anni";
    }
}
