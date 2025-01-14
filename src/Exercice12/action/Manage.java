package Exercice12.action;

import Exercice12.domain.FileLogger;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Manage {
    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        System.out.println("""
                1 - Entrer une chaine à la place d'un chiffre
                2 - Quitter
                """);
        String choice = scanner.nextLine();
        if (choice.startsWith("1")) this.numberError();
        else if (choice.startsWith("2")) this.exit();
        else this.execute();
    }

    private void numberError() {
        System.out.println("Entrer un chiffre (ou pas ...)");
        String in = scanner.nextLine();
        try {
            System.out.println(Integer.parseInt(in) + " est un chiffre");
        } catch (NumberFormatException e) {
            new FileLogger().log(e.getMessage());

        }
        this.execute();
    }

    private void exit() {
        System.out.println("Vous quittez le programme");
    }
}
