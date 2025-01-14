package Exercice5;

public class Membre extends User{
    private final String role = "Membre";

    public Membre(String name) {
        super(name);
    }

    @Override
    public void getRole() {
        System.out.println("Le role est " + role);
    }

}
