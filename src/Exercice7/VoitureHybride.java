package Exercice7;

public class VoitureHybride implements Vehicule, Thermique, Electrique{
    @Override
    public void recharger() {
        System.out.println("La voiture recharge");
    }

    @Override
    public void faireLePlein() {
        System.out.println("Vous faites le plein");
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre");
    }
}
