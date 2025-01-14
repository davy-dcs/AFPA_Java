package Exercice5;

public class Admin extends User{
    private final String role = "Admin";
    public Admin(String name) {
        super(name);
    }

    @Override
    public void getRole() {
        System.out.println("Le role est " + role);
    }
}
