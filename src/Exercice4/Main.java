package Exercice4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
            Exercice 4 : Copier le contenu d’un fichier
            Objectif : Apprendre à copier le contenu d’un fichier vers un autre fichier.

            Créez un fichier source.txt avec du texte.
            Créez un programme qui copie le contenu de source.txt dans un fichier destination.txt.
         */

        File source = new File("src/Exercice4", "source.txt");

        // Créez un fichier source.txt avec du texte.
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(source))) {
            for (int i = 0; i < 10; i++) {
                bufferedWriter.write("Je suis la ligne " + i);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Créez un programme qui copie le contenu de source.txt dans un fichier destination.txt.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/Exercice4", "destination.txt")))) {
                if (bufferedReader.ready()) {
                    bufferedReader.transferTo(bufferedWriter);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
