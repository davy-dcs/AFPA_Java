package Exercice9.domain;

import java.util.Objects;

public abstract class AEmploye implements Employe {
    protected String nom;

    public AEmploye(String nom) {
        this.nom = nom;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AEmploye aEmploye = (AEmploye) o;
        return Objects.equals(nom, aEmploye.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }
}
