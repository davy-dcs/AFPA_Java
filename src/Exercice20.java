import java.util.ArrayList;
import java.util.Scanner;

public class Exercice20 {
    public static void main(String[] args) {
        /*
        Demandez à l'utilisateur de gérer une liste de prénoms avec les fonctionnalités suivantes :
            Ajouter un prénom.
            Supprimer un prénom par son index.
            Rechercher un prénom.
            Afficher tous les prénoms.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> firstnames = new ArrayList<>();
        System.out.println("Entrer help pour afficher les commandes");
        boolean exit = false;
        do {
            String cmd = sc.nextLine();
            if (cmd.equalsIgnoreCase("exit")) {
                exit = true;
            } else if (cmd.equalsIgnoreCase("help")) {
                System.out.println("firstname [option] [arguments]\n\t[option] :\n\t\tadd [firstname]\n\t\t\tPermet d'ajouter un prénom à la liste.\n\t\tdelete [index]\n\t\t\tPermet de supprimer un prénom à l'index donné.\n\t\tsearch [firstname]\n\t\t\tPermet de rechercher si un prénom est présent dans la liste.\n\t\tshow\n\t\t\tPermet d'afficher les prénoms de la liste.");
            } else if (cmd.toLowerCase().startsWith("add")) {
                String firstname = cmd.substring(4);
                firstnames.add(firstname);
            } else if (cmd.toLowerCase().startsWith("delete")) {
                int index = Integer.parseInt(cmd.substring(7));
                try {
                    System.out.printf("Le prénom %s est supprimé\n", firstnames.get(index));
                    firstnames.remove(index);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("L'index est trop élevé.");
                }
            } else if (cmd.toLowerCase().startsWith("search")) {
                String search = cmd.substring(7);
                boolean result = false;
                for (int i = 0; i < firstnames.size(); i++) {
                    if (firstnames.get(i).toLowerCase().contains(search.toLowerCase())){
                        result = true;
                        System.out.println(firstnames.get(i));
                    }
                }
                if (!result) {
                    System.out.printf("Le prénom %s n'a pas été trouvé.\n", search);
                }
            } else if (cmd.toLowerCase().startsWith("show")) {
                for (String s : firstnames) {
                    System.out.println(s);
                }
            } else {
                System.out.println("Commande non valide.");
            }
        } while (!exit);
    }
}
