package Exercice2;

public class Chien implements Animal, Nageur{
    @Override
    public void faireDuBruit() {
        System.out.println("Bruit de chien");
    }

    @Override
    public void nager() {
        System.out.println("Je nage comme un chien");
    }
}
