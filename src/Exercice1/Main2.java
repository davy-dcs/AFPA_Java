package Exercice1;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        /*
            Exercice 1 : Création et écriture dans un fichier
            Objectif : Apprendre à créer un fichier et à y écrire du contenu.

            Créez un fichier nommé output.txt.
            Écrivez la phrase "Bonjour, monde!" dans ce fichier.
            Vérifiez que le fichier est bien créé et que le contenu est correct.
         */

        // Créez un fichier nommé output2.txt.
        File file = new File("src/Exercice1", "output2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Écrivez la phrase "Bonjour, monde!" dans ce fichier.
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write("Bonjour, monde!".getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Vérifiez que le fichier est bien créé et que le contenu est correct.
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (bufferedInputStream.available() > 0) {
                stringBuilder.appendCodePoint(bufferedInputStream.read());
            }
            System.out.println("Contenu correct : " + stringBuilder.toString().equals("Bonjour, monde!"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
