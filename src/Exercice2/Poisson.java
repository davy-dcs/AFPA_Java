package Exercice2;

public class Poisson implements Animal, Nageur{
    @Override
    public void faireDuBruit() {
        System.out.println("Bruit de poisson");
    }

    @Override
    public void nager() {
        System.out.println("je nage");
    }
}
