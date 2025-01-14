package Exercice4;

import java.util.ArrayList;

public class JeuDeCarte {
    private ArrayList<Carte> jeu = new ArrayList<>();
    public void add(Carte carte) {
        jeu.add(carte);
    }
    public void melanger(){
        ArrayList<Carte> jeuClone = jeu;
        ArrayList<Carte> jeuRandom = new ArrayList<>();

        while (jeuClone.size() != 0) {
            int r = (int) (Math.random() * jeuClone.size());

            jeuRandom.add(jeuClone.get(r));
            jeuClone.remove(r);
        }
        jeu = jeuRandom;
    }
    public void afficher() {
        for (Carte carte : jeu) {
            System.out.println(carte.getValeur() + " de "+carte.getCouleur());
        }
    }
}
