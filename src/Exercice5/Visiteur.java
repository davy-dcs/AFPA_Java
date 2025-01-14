package Exercice5;

public class Visiteur implements Utilisateur{
    private final String role = "Visiteur";


    @Override
    public void connexion() {
        System.out.println("Créer un compte pour vous connecter");
    }

    @Override
    public void deconnexion() {
        System.out.println("Impossible de se déconnecter tant que vous n'etes pas connecté");
    }

    @Override
    public void getRole() {
        System.out.println("Le role est " + role);
    }
}
