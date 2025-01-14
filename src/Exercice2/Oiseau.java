package Exercice2;

public class Oiseau implements Animal, Volant{
    @Override
    public void faireDuBruit() {
        System.out.println("Bruit d'oiseau");
    }

    @Override
    public void voler() {
        System.out.println("Je vole");
    }
}
