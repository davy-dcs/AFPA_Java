package Exercice9csv.domain;

public class EmployeTempsPlein extends AEmploye {
    private double salaire;

    public EmployeTempsPlein(String nom, double salaire) {
        super(nom);
        this.salaire = salaire;
    }

    @Override
    public double calculerSalaire() {
        return this.salaire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeTempsPlein,");
        sb.append(nom + ",");
        sb.append(",,");
        sb.append(salaire);
        return sb.toString();
    }

}
