package Exercice6;

public class PaiementEspece implements Paiement{
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Vous payez " + montant + " en espece");
    }
}
