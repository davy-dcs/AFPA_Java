package Exercice7;

public class VoitureElectrique implements Vehicule, Electrique{
    @Override
    public void recharger() {
        System.out.println("La voiture recharge");
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre");
    }
}
