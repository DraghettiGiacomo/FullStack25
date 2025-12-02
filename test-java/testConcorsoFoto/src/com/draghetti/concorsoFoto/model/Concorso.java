package com.draghetti.concorsoFoto.model;

import com.draghetti.concorsoFoto.model.partecipante.Partecipante;
import com.draghetti.concorsoFoto.model.valutazione.Valutazione;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class Concorso implements Serializable {
    private long id;
    private String nome;
    private String tema;
    private Valutazione regolaValutazione;
    private List<Partecipante> partecipanti;
    private List<Foto> fotoInviate;

    public Concorso(long id, String nome, String tema, Valutazione regola) {
        this.id = id;
        this.nome = nome;
        this.tema = tema;
        this.regolaValutazione = regola;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public Valutazione getRegolaValutazione() {
        return regolaValutazione;
    }
    public void setRegolaValutazione(Valutazione regolaValutazione) {
        this.regolaValutazione = regolaValutazione;
    }
    public List<Partecipante> getPartecipanti() {
        return partecipanti;
    }
    public void setPartecipanti(List<Partecipante> partecipanti) {
        this.partecipanti = partecipanti;
    }
    public List<Foto> getFotoInviate() {
        return fotoInviate;
    }
    public void setFotoInviate(List<Foto> fotoInviate) {
        this.fotoInviate = fotoInviate;
    }

    public void aggiungiPartecipante(Partecipante p) {
        if (p != null && !partecipanti.contains(p)) {
            partecipanti.add(p);
        }
    }
    public void aggiungiFoto(Foto f) {
        if (f != null && !fotoInviate.contains(f)) {
            fotoInviate.add(f);
        }
    }
    public void registraEvento(Foto foto, String tipoEvento) {
        regolaValutazione.applicaEvento(foto, tipoEvento);
    }
    public List<Partecipante> getClassificaOrdinata() {
        return partecipanti.stream()
                .sorted(Comparator //serve per definire un ordinamento personalizzato in questo caso mi serviva per puntgeggio decrescente e in caso di parità per nome
                        .comparingInt(Partecipante::getPunteggio).reversed()
                        .thenComparing(Partecipante::getNome))
                .toList();
    }
}
