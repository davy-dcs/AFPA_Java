package Exercice13.domain;

public class LivrePapier extends ALivre{
    public LivrePapier(String titre, String auteur) {
        super(titre, auteur);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LivrePapier{");
        sb.append("titre='").append(titre).append('\'');
        sb.append(", auteur='").append(auteur).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
