package Exercice5;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
            Exercice 5 : Vérification de l'existence d'un fichier
            Objectif : Vérifier si un fichier existe et afficher un message en conséquence.

            Écrivez un programme qui vérifie si le fichier example.txt existe.
            S'il existe, affichez "Le fichier existe.", sinon affichez "Le fichier n'existe pas.".
         */

        // Créer le fichier example.txt
        File example = new File("src/Exercice5", "example.txt");
        try {
            example.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //S'il existe, affichez "Le fichier existe.", sinon affichez "Le fichier n'existe pas.".
        if (search(new File("."), "example.txt")) {
            System.out.println("Le fichier existe.");
        } else {
            System.out.println("Le fichier n'existe pas.");
        }

    }

    // Écrivez un programme qui vérifie si le fichier example.txt existe.
    private static boolean search(File rep, String search) {
        if (rep.isDirectory()) {
            String[] pathnames = rep.list();
            for (String pathname : pathnames) {
                File rep2 = new File(rep.getPath(), pathname);
                if (rep2.isFile() && rep2.getName().equals(search)) return true;
                if (rep2.isDirectory()) {
                    if (search(rep2, search)) return true;
                } else {
                    if (rep2.isFile() && rep2.getName().equals(search)) return true;
                }
            }
        }
        return false;
    }
}
