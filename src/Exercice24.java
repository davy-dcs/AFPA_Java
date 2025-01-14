import java.util.ArrayList;
import java.util.Scanner;

public class Exercice24 {
    public static void main(String[] args) {
        /*
        Créez un programme qui enregistre toutes les commandes entrées par l'utilisateur dans une ArrayList. Ajoutez les fonctionnalités suivantes :
            Afficher l'historique des commandes.
            Supprimer une commande spécifique par son index.
            Rechercher une commande contenant un mot donné.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> commandes = new ArrayList<>();
        System.out.println("Entrer help pour afficher les commandes");
        boolean exit = false;
        do {
            String cmd = sc.nextLine();
            commandes.add(cmd);
            if (cmd.equalsIgnoreCase("exit")) {
                exit = true;
            } else if (cmd.equalsIgnoreCase("help")) {
                System.out.println("""
                        String [option] [arguments]
                            [option] :
                                show [string]
                                    Permet d'afficher l'historique des commandes.
                                search [String]
                                    Permet de rechercher les chaines selon un mot.
                                delete [index]
                                    Permet de supprimer une commande de l'historique.
                        """);
            } else if (cmd.equalsIgnoreCase("show")) {
                for (String s : commandes) {
                    System.out.println(s);
                }
            } else if (cmd.toLowerCase().startsWith("search")) {
                String word = cmd.substring(7);
                for (String s : commandes) {
                    if (s.contains(word)){
                        System.out.println(s);
                    }
                }
            } else if (cmd.toLowerCase().startsWith("delete")) {
                int index = Integer.parseInt(cmd.substring(7));
                if (index < commandes.size()){
                    commandes.remove(index);
                } else {
                    System.out.println("Index trop grand.");
                }
            } else {
                System.out.println("Commande non valide.");
            }
        } while (!exit);
    }
}
