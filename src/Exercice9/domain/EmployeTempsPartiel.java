package Exercice9.domain;

public class EmployeTempsPartiel extends AEmploye {
    private double salaireHoraire;
    private int nombreHeures;

    public EmployeTempsPartiel(String nom, double salaireHoraire, int nombreHeures) {
        super(nom);
        this.salaireHoraire = salaireHoraire;
        this.nombreHeures = nombreHeures;
    }

    @Override
    public double calculerSalaire() {
        return this.salaireHoraire * this.nombreHeures;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeTempsPartiel{");
        sb.append("nom=").append(nom);
        sb.append(", nombreHeures=").append(nombreHeures);
        sb.append(", salaireHoraire=").append(salaireHoraire);
        sb.append(", salaire=").append(calculerSalaire());
        sb.append('}');
        return sb.toString();
    }
}
