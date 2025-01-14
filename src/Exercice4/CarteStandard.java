package Exercice4;

public class CarteStandard implements Carte{
    private final String valeur;
    private final String couleur;

    public CarteStandard(String valeur, String couleur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "valeur= " + valeur +", couleur= " + couleur + '\n';
    }

    @Override
    public String getValeur() {
        return valeur;
    }

    @Override
    public String getCouleur() {
        return couleur;
    }
}
