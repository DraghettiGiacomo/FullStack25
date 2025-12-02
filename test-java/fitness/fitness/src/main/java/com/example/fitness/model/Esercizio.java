package com.example.fitness.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.List;

@Entity
@Table(name = "esercizi")
public class Esercizio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Il nome è obbligatorio.")
    @Size(min = 3, message = "Il nome deve contenere almeno 3 caratteri.")
    private String nome;
    @NotBlank(message = "Il gruppo muscolare è obbligatorio.")
    private String gruppoMuscolare;
    @ElementCollection
    @CollectionTable(name = "esercizio_strumenti", joinColumns = @JoinColumn(name = "esercizio_id"))
    @Column(name = "strumento")
    @NotEmpty(message = "L'elenco degli strumenti non può essere vuoto.")
    private List<String> strumenti;
    @NotBlank(message = "La descrizione è obbligatoria.")
    @Size(min = 10, message = "La descrizione deve contenere almeno 10 caratteri.")
    private String descrizione;
    @Min(value = 1, message = "La difficoltà minima è 1.")
    @Max(value = 5, message = "La difficoltà massima è 5.")
    private int difficolta;
    @NotBlank(message = "Il tempo di esecuzione è obbligatorio.")
    private String tempoEsecuzione;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGruppoMuscolare() {
        return gruppoMuscolare;
    }
    public void setGruppoMuscolare(String gruppoMuscolare) {
        this.gruppoMuscolare = gruppoMuscolare;
    }
    public List<String> getStrumenti() {
        return strumenti;
    }
    public void setStrumenti(List<String> strumenti) {
        this.strumenti = strumenti;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public int getDifficolta() {
        return difficolta;
    }
    public void setDifficolta(int difficolta) {
        this.difficolta = difficolta;
    }
    public String getTempoEsecuzione() {
        return tempoEsecuzione;
    }
    public void setTempoEsecuzione(String tempoEsecuzione) {
        this.tempoEsecuzione = tempoEsecuzione;
    }
}