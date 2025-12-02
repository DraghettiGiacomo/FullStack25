package com.draghetti.concorsoFoto.model;

import com.draghetti.concorsoFoto.model.partecipante.Partecipante;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestoreConcorso implements Serializable {
    private List<Concorso> concorsi = new ArrayList<>();

    public GestoreConcorso(List<Concorso> concorsi) {
        this.concorsi = concorsi;
    }

    public List<Concorso> getConcorsi() {
        return concorsi;
    }
    public void setConcorsi(List<Concorso> concorsi) {
        this.concorsi = concorsi;
    }

    public void aggiungiConcorso(Concorso c) {
        concorsi.add(c);
    }
    public Concorso cercaConcorso(String nome) {
        return concorsi.stream()
                .filter(c -> c.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
    public void stampaClassifiche() {
        for (Concorso c : concorsi) {
            System.out.println("Classifica Concorso: " + c.getNome());
            List<Partecipante> classifica = c.getClassificaOrdinata();
            for (Partecipante p : classifica) {
                System.out.println(p.getNome() + " - " + p.getPunteggio());
            }
        }
    }
    public void salvaTuttiConcorsi(String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(concorsi); // salva l'intera lista
            System.out.println("Concorsi salvati correttamente in " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public void caricaTuttiConcorsi(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            concorsi = (List<Concorso>) ois.readObject(); // legge l'intera lista
            System.out.println("Concorsi caricati correttamente da " + path);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
