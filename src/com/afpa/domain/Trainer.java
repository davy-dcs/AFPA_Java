package com.afpa.domain;

import java.util.Objects;

/**
 * Classe formateur, enfant de la classe abstraite Person
 */
public class Trainer extends Person {
    private String expertise;

    /**
     * Construit un formateur
     *
     * @param name      du formateur
     * @param expertise du formateur
     */
    public Trainer(String name, String expertise) {
        super(name);
        this.expertise = expertise;
    }

    /**
     * Obtient l'expertise du formateur
     *
     * @return String
     */
    public String getExpertise() {
        return expertise;
    }

    /**
     * Affecte l'expertise du formateur
     *
     * @param expertise String
     */
    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "Trainer{" + ", id=" + ID + ", name='" + name + '\'' + "expertise='" + expertise + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return Objects.equals(name, trainer.name) && Objects.equals(expertise, trainer.expertise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, expertise);
    }
}
