package Exercice6;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
            Exercice 6 : Suppression d'un fichier
            Objectif : Apprendre à supprimer un fichier en Java.

            Créez un fichier temporaire temp.txt.
            Écrivez un programme qui supprime ce fichier et affiche "Fichier supprimé avec succès." si la suppression a réussi.
         */

        // Créez un fichier temporaire temp.txt.
        File temp = new File("src/Exercice6", "temp.txt");
        try {
            temp.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Écrivez un programme qui supprime ce fichier et affiche "Fichier supprimé avec succès." si la suppression a réussi.
         if (temp.delete()) System.out.println("Fichier supprimé avec succès.");

    }
}
