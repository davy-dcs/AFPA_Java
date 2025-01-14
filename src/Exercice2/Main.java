package Exercice2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
            Exercice 2 : Lecture d’un fichier texte
            Objectif : S’entraîner à lire le contenu d’un fichier ligne par ligne.

            Créez un fichier nommé data.txt contenant plusieurs lignes de texte.
            Lisez le fichier ligne par ligne et affichez chaque ligne à l'écran.
         */

        File data = new File("src/Exercice2", "data.txt");

        // Créez un fichier nommé data.txt contenant plusieurs lignes de texte.
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(data))) {
            for (int i = 0; i < 10; i++) {
                bufferedWriter.write("Ligne " + i);
                if (i != 9) bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Lisez le fichier ligne par ligne et affichez chaque ligne à l'écran.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(data))) {
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
