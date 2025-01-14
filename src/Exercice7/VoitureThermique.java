package Exercice7;

public class VoitureThermique implements Vehicule, Thermique{
    @Override
    public void faireLePlein() {
        System.out.println("Vous faites le plein");
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre");
    }
}
