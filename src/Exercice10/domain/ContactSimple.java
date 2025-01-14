package Exercice10.domain;

import java.util.Objects;

public class ContactSimple implements Contact {
    private String nom;
    private String numeroTelephone;

    public ContactSimple(String nom, String numeroTelephone) {
        this.nom = nom;
        this.numeroTelephone = numeroTelephone;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public String getNumeroTelephone() {
        return this.numeroTelephone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContactSimple that = (ContactSimple) o;
        return Objects.equals(numeroTelephone, that.numeroTelephone);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroTelephone);
    }

    @Override
    public String toString() {
        return "ContactSimple{" + "nom='" + nom + '\'' + ", numeroTelephone='" + numeroTelephone + '\'' + '}';
    }
}
