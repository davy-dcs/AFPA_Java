package Exercice13.domain;

public class LivreNumerique extends ALivre{
    public LivreNumerique(String titre, String auteur) {
        super(titre, auteur);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LivreNumerique{");
        sb.append("titre='").append(titre).append('\'');
        sb.append(", auteur='").append(auteur).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
