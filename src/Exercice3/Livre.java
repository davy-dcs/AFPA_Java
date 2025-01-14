package Exercice3;

public class Livre implements Document{
    @Override
    public void afficherDetails() {
        System.out.println("Je suis le detail d'un livre");
    }

    public void obtenirAuteur() {
        System.out.println("Je suis l'auteur");
    }
}
