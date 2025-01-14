package Exercice3;

public class Magasine implements Document{
    @Override
    public void afficherDetails() {
        System.out.println("Je suis le detail du magasine");
    }

    public void couverture() {
        System.out.println("je suis la couverture du magasine");
    }
}
