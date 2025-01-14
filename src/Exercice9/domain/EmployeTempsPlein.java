package Exercice9.domain;

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
        final StringBuilder sb = new StringBuilder("EmployeTempsPlein{");
        sb.append("nom=").append(nom);
        sb.append(", salaire=").append(salaire);
        sb.append('}');
        return sb.toString();
    }

}
