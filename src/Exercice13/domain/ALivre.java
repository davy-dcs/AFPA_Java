package Exercice13.domain;

import java.util.Objects;

public abstract class ALivre implements Livre {
    protected String titre;
    protected String auteur;

    public ALivre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String getTitre() {
        return this.titre;
    }

    @Override
    public String getAuteur() {
        return this.auteur;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ALivre aLivre = (ALivre) o;
        return Objects.equals(titre, aLivre.titre) && Objects.equals(auteur, aLivre.auteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, auteur);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ALivre{");
        sb.append("titre='").append(titre).append('\'');
        sb.append(", auteur='").append(auteur).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
