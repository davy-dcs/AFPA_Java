package Exercice9;

public class ProduitPhysique implements Produit{
    private String nom;
    private double prix;

    public ProduitPhysique(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public void getNom() {
        System.out.println(nom);
    }

    @Override
    public void getPrix() {
        System.out.println(prix);
    }

    @Override
    public void afficherDetails() {
        System.out.println(getClass() + " nom : " + nom + " prix : " + prix);
    }
}
