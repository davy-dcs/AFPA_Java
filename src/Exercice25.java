import java.util.ArrayList;
import java.util.Scanner;

public class Exercice25 {
    public static void main(String[] args) {
        /*
        Créez une ArrayList contenant des chaînes de caractères. Implémentez des fonctionnalités pour :
            Afficher les chaînes commençant par une lettre donnée.
            Afficher les chaînes contenant un mot donné (insensible à la casse).
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
                                add [String]
                                    Permet d'ajouter une chaine à la liste.
                                begin [char]
                                    Permet d'afficher les chaines commançant par une lettre donnée.
                                word [String]
                                    Permet d'afficher les chaines contenant le mot donnée.
                                
                        """);
            } else if (cmd.toLowerCase().startsWith("add")) {
                chaines.add(cmd.substring(4));
            } else if (cmd.toLowerCase().startsWith("begin")) {
                char begin = cmd.charAt(6);
                for (String chaine : chaines) {
                    if (chaine.charAt(0) == begin) {
                        System.out.println(chaine);
                    }
                }
            } else if (cmd.toLowerCase().startsWith("word")) {
                String word = cmd.split(" ")[1];
                for (String chaine : chaines) {
                    boolean show = false;
                    for (String s : chaine.split(" ")) {
                        if (s.equals(word)) {
                            show = true;
                            break;
                        }
                    }
                    if (show) {
                        System.out.println(chaine);
                    }
                }
            } else {
                System.out.println("Commande non valide.");
            }
        } while (!exit);
    }
}
