import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercice21 {
    public static void main(String[] args) {
        /*
        Demandez à l'utilisateur d'ajouter des nombres dans une ArrayList et implémentez les fonctionnalités suivantes :
            Afficher les nombres dans l'ordre croissant.
            Afficher les nombres dans l'ordre décroissant.
            Trouver le maximum et le minimum de la liste.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Entrer help pour afficher les commandes");
        boolean exit = false;
        do {
            String cmd = sc.nextLine();
            if (cmd.equalsIgnoreCase("exit")) {
                exit = true;
            } else if (cmd.equalsIgnoreCase("help")) {
                System.out.println("numbers [option] [arguments]\n\t[option] :\n\t\tadd [number]\n\t\t\tPermet d'ajouter un nombre à la liste.\n\t\tcroissant\n\t\t\tPermet d'afficher la liste dans l'ordre croissant.\n\t\tdecroissant\n\t\t\tPermet d'afficher la liste dans l'ordre décroissant.\n\t\topposite\n\t\t\tPermet d'afficher le plus petit et le plus grand nombre de la liste.");
            } else if (cmd.toLowerCase().startsWith("add")) {
                int number = Integer.parseInt(cmd.substring(4));
                numbers.add(number);
            } else if (cmd.equalsIgnoreCase("croissant")) {
                Collections.sort(numbers);
                for (int number : numbers) {
                    System.out.println(number);
                }
            } else if (cmd.equalsIgnoreCase("decroissant")) {
                Collections.sort(numbers);
                Collections.reverse(numbers);
                for (int number : numbers) {
                    System.out.println(number);
                }
            } else if (cmd.equalsIgnoreCase("opposite")) {
                int min = numbers.get(0);
                int max = numbers.get(0);
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) < min) {
                        min = numbers.get(i);
                    }
                    if (numbers.get(i) > max) {
                        max = numbers.get(i);
                    }
                }
                System.out.printf("Le plus petit nombre est %d et le plus grand est %d.", min, max);
            } else {
                System.out.println("Commande non valide.");
            }
        } while (!exit);
    }
}
