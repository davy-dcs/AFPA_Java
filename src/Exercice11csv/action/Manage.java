package Exercice11csv.action;

import Exercice11csv.domain.ScoreManagerFichier;

import java.util.Scanner;

public class Manage {
    private ScoreManagerFichier scoreManagerFichier = new ScoreManagerFichier();
    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        System.out.println("""
                1 - Ajouter un score
                2 - Afficher les scores
                3 - Sauvegarder et quitter
                """);
        String choice = scanner.nextLine();
        if (choice.startsWith("1")) this.add();
        else if (choice.startsWith("2")) this.show();
        else if (choice.startsWith("3")) this.save();
        else this.execute();
    }

    private void add() {
        System.out.println("Nom du joueur :");
        String pseudo = scanner.nextLine();
        System.out.println("Score :");
        String score = scanner.nextLine();
        try {
            scoreManagerFichier.ajouterScore(pseudo, Integer.parseInt(score));
            this.execute();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            this.add();
        }
    }

    private void show() {
        scoreManagerFichier.afficherScores();
        this.execute();
    }

    private void save() {
        scoreManagerFichier.save();
        System.out.println("Vous quitez le programme");
        this.scanner.close();
    }
}
