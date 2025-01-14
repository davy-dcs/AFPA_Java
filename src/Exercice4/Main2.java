package Exercice4;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        /*
            Exercice 4 : Copier le contenu d’un fichier
            Objectif : Apprendre à copier le contenu d’un fichier vers un autre fichier.

            Créez un fichier source.txt avec du texte.
            Créez un programme qui copie le contenu de source.txt dans un fichier destination.txt.
         */

        File source = new File("src/Exercice4", "source2.txt");

        // Créez un fichier source.txt avec du texte.
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(source))) {
            for (int i = 0; i < 10; i++) {
                bufferedOutputStream.write(("Je suis la ligne " + i + "\n").getBytes());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Créez un programme qui copie le contenu de source.txt dans un fichier destination.txt.
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(source))) {
            try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("src/Exercice4", "destination2.txt")))) {
                bufferedInputStream.transferTo(bufferedOutputStream);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
