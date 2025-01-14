package Exercice10csv.action;

import Exercice10csv.domain.ContactSimple;
import Exercice10csv.service.ContactService;

import java.util.Scanner;

public class Manage {
    private ContactService contacts = new ContactService();
    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        System.out.println("""
                1 - Ajouter un contact
                2 - Sauvegarder & quitter
                3 - Quitter
                """);
        String choice = scanner.nextLine();
        if (choice.startsWith("1")) this.add();
        else if (choice.startsWith("2")) this.save();
        else if (choice.startsWith("3")) this.exit();
        else this.execute();
    }

    private void add() {
        System.out.println("Nom du contact");
        String name = scanner.nextLine();
        System.out.println("Numéro de téléphone");
        String phone = scanner.nextLine();
        try {
            int testNumero = Integer.parseInt(phone);
            contacts.add(new ContactSimple(name, phone));
            this.execute();
        } catch (NumberFormatException e) {
            System.out.println("Entrer un numéro valide.");
            this.add();
        }
    }

    private void save() {
        this.contacts.save();
        this.exit();
    }

    private void exit() {
        this.scanner.close();
        System.out.println("Vous quittez le programme.");
    };
}
