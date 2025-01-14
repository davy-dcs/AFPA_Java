package Exercice7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
            Exercice 7 : Ajout de contenu à un fichier existant
            Objectif : Ajouter du contenu à la fin d’un fichier sans écraser les données existantes.

            Créez un fichier log.txt et écrivez-y quelques lignes.
            Écrivez un programme qui ajoute la ligne "Nouvelle entrée dans le journal" à la fin du fichier.
         */

        // Créez un fichier log.txt et écrivez-y quelques lignes.
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/Exercice7", "log.txt")))) {
            for (int i = 0; i < 10; i++) {
                bufferedWriter.write("Création de la ligne " + i);
                if (i != 9) bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Écrivez un programme qui ajoute la ligne "Nouvelle entrée dans le journal" à la fin du fichier.
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/Exercice7", "log.txt"), true))) {
            bufferedWriter.newLine();
            bufferedWriter.write("Nouvelle entrée dans le journal");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
