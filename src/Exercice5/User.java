package Exercice5;

public abstract class User implements Utilisateur {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void connexion() {
        System.out.println(name + " est connecté");
    }
    @Override
    public void deconnexion() {
        System.out.println(name + " est déconnecté");
    }
}
