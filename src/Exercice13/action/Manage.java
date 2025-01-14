package Exercice13.action;

import Exercice13.domain.LivreNumerique;
import Exercice13.domain.LivrePapier;
import Exercice13.service.LivreService;

import java.util.Scanner;

public class Manage {
    private LivreService livreService = new LivreService();
    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        System.out.println("""
                1 - Ajouter un livre
                2 - Afficher les livres
                3 - Quitter
                """);
        String choice = scanner.nextLine();
        if (choice.startsWith("1")) this.add();
        else if (choice.startsWith("2")) this.show();
        else if (choice.startsWith("3")) this.exit();
        else this.execute();
    }

    private void add() {
        System.out.println("Entrer le titre du livre");
        String titre = scanner.nextLine();
        System.out.println("Entrer l'auteur du livre");
        String auteur = scanner.nextLine();
        String formatLivre;
        do {
            System.out.println("Entrer 'num' pour numérique ou 'pap' pour papier");
            formatLivre = scanner.nextLine();
        } while (!(formatLivre.equalsIgnoreCase("num") || formatLivre.equalsIgnoreCase("pap")));

        if (formatLivre.equalsIgnoreCase("num")) livreService.add(new LivreNumerique(titre, auteur));
        else livreService.add(new LivrePapier(titre, auteur));
        this.execute();
    }

    private void show() {
        livreService.show();
        this.execute();
    }

    private void exit() {
        System.out.println("Vous quittez le programme.");
    }
}
