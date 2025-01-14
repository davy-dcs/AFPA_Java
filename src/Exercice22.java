import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercice22 {
    public static void main(String[] args) {
        /*
        Créez un programme où l'utilisateur peut ajouter des nombres dans une ArrayList. Divisez ces nombres en deux listes :
            Une liste pour les nombres pairs.
            Une liste pour les nombres impairs.
            Affichez les deux listes séparément.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> pairs = new ArrayList<>();
        ArrayList<Integer> impairs = new ArrayList<>();
        System.out.println("Entrer help pour afficher les commandes");
        boolean exit = false;
        do {
            String cmd = sc.nextLine();
            if (cmd.equalsIgnoreCase("exit")) {
                exit = true;
            } else if (cmd.equalsIgnoreCase("help")) {
                System.out.println("""
                        numbers [option] [arguments]
                            [option] :
                                add [number]
                                    Permet d'ajouter un nombre.
                                show
                                    Permet d'afficher la liste des pairs et la liste des impairs.
                        """);
            } else if (cmd.toLowerCase().startsWith("add")) {
                int number = Integer.parseInt(cmd.substring(4));
                if (number % 2 == 0) {
                    pairs.add(number);
                } else {
                    impairs.add(number);
                }
            } else if (cmd.equalsIgnoreCase("show")) {
                System.out.println("Liste des pairs :");
                for (int number : pairs) {
                    System.out.println(number);
                }
                System.out.println("Liste des impairs :");
                for (int number : impairs) {
                    System.out.println(number);
                }
            } else {
                System.out.println("Commande non valide.");
            }
        } while (!exit);
    }
}
