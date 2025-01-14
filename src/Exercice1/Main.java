package Exercice1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
            Exercice 1 : Création et écriture dans un fichier
            Objectif : Apprendre à créer un fichier et à y écrire du contenu.

            Créez un fichier nommé output.txt.
            Écrivez la phrase "Bonjour, monde!" dans ce fichier.
            Vérifiez que le fichier est bien créé et que le contenu est correct.
         */

        // Créez un fichier nommé output.txt.
        File file = new File("src/Exercice1", "output.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Écrivez la phrase "Bonjour, monde!" dans ce fichier.
        try (FileWriter fileWriter = new FileWriter(file)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Bonjour, monde!");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Vérifiez que le fichier est bien créé et que le contenu est correct.
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.ready()) {
                System.out.println("Contenu correct : " + bufferedReader.readLine().equals("Bonjour, monde!"));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
