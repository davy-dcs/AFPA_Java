package Exercice7;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        /*
            Exercice 7 : Ajout de contenu à un fichier existant
            Objectif : Ajouter du contenu à la fin d’un fichier sans écraser les données existantes.

            Créez un fichier log.txt et écrivez-y quelques lignes.
            Écrivez un programme qui ajoute la ligne "Nouvelle entrée dans le journal" à la fin du fichier.
         */

        // Créez un fichier log.txt et écrivez-y quelques lignes.
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("src/Exercice7", "log2.txt")))) {
            for (int i = 0; i < 10; i++) {
                bufferedOutputStream.write(("Création de la ligne " + i).getBytes());
                if (i != 9) bufferedOutputStream.write("\n".getBytes());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Écrivez un programme qui ajoute la ligne "Nouvelle entrée dans le journal" à la fin du fichier.
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("src/Exercice7", "log2.txt"), true))) {
            bufferedOutputStream.write("\nNouvelle entrée dans le journal".getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
