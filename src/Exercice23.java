import java.util.ArrayList;
import java.util.Scanner;

public class Exercice23 {
    public static void main(String[] args) {
        /*
        Créez une ArrayList de chaînes de caractères. Implémentez une fonctionnalité pour afficher toutes les chaînes contenant une lettre spécifique donnée par l'utilisateur.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> chaines = new ArrayList<>();
        System.out.println("Entrer help pour afficher les commandes");
        boolean exit = false;
        do {
            String cmd = sc.nextLine();
            if (cmd.equalsIgnoreCase("exit")) {
                exit = true;
            } else if (cmd.equalsIgnoreCase("help")) {
                System.out.println("""
                        String [option] [arguments]
                            [option] :
                                add [string]
                                    Permet d'ajouter une chaine.
                                search [char]
                                    Permet de rechercher les chaines selon une caractère.
                        """);
            } else if (cmd.toLowerCase().startsWith("add")) {
                chaines.add(cmd.substring(4));
            } else if (cmd.toLowerCase().startsWith("search")) {
                char search = cmd.toLowerCase().charAt(7);
                for (String s : chaines) {
                    if (s.contains(String.valueOf(search))) {
                        System.out.println(s);
                    }
                }
            } else if (cmd.equalsIgnoreCase("doublon")) {
                for (int i = 0; i < chaines.size(); i++) {
                    while (chaines.lastIndexOf(chaines.get(i)) != i)
                        chaines.remove(chaines.lastIndexOf(chaines.get(i)));
                }
                for (String s : chaines) {
                    System.out.println(s);
                }
            } else {
                System.out.println("Commande non valide.");
            }
        } while (!exit);
    }
}
