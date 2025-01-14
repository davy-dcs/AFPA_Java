package Exercice9.action;

import Exercice9.domain.Employe;
import Exercice9.domain.EmployeTempsPartiel;
import Exercice9.domain.EmployeTempsPlein;
import Exercice9.service.EmployeService;

import java.util.Scanner;

public class Manage {
    private EmployeService employes = new EmployeService();
    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        System.out.println("""
                1 - Ajouter un employé
                2 - Sauvegarder
                3 - Quitter
                """);
        String in = this.scanner.nextLine();
        if (in.startsWith("1")) {
            this.addEmploye();
        } else if (in.startsWith("2")) {
            this.save();
        } else if (in.startsWith("3")) {
            this.exit();
        } else {
            System.out.println("Entrer une commande valide.");
            this.execute();
        }
    }

    private void addEmploye() {
        System.out.println("""
                    1 - Ajouter un employé à temps plein
                    2 - Ajouter un employé à temps partiel
                    3 - Retour au menu
                    """);
        String in = this.scanner.nextLine();
        if (in.startsWith("1")) {
            System.out.println("Entrer le nom");
            String name = this.scanner.nextLine();
            System.out.println("Entrer le salaire");
            String salaire = this.scanner.nextLine();
            try {
                this.employes.add(new EmployeTempsPlein(name, Double.parseDouble(salaire)));
                this.execute();
            } catch (NumberFormatException e) {
                System.out.println("Entrer un format correct.");
                this.addEmploye();
            }
        } else if (in.startsWith("2")) {
            System.out.println("Entrer le nom");
            String name = this.scanner.nextLine();
            System.out.println("Entrer le taux horaire");
            String tauxHoraire = this.scanner.nextLine();
            System.out.println("Entrer le nombre d'heure");
            String heures = this.scanner.nextLine();
            try {
                this.employes.add(new EmployeTempsPartiel(name, Double.parseDouble(tauxHoraire), Integer.parseInt(heures)));
                this.execute();
            } catch (NumberFormatException e) {
                System.out.println("Entrer un format correct.");
                this.addEmploye();
            }
        } else if (in.startsWith("3")) {
            this.execute();
        } else {
            System.out.println("Entrer une commande valide.");
            this.execute();
        }
    }

    private void save() {
        this.employes.save();
        this.execute();
    }

    private void exit() {
        this.scanner.close();
        System.out.println("Vous quittez le programme.");
    }
}
