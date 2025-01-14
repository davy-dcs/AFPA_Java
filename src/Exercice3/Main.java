package Exercice3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
            Exercice 3 : Comptage des mots dans un fichier
            Objectif : Lire un fichier et compter le nombre de mots qu’il contient.

            Créez un fichier nommé words.txt avec plusieurs phrases.
            Écrivez un programme qui compte le nombre total de mots dans le fichier.
         */

        File words = new File("src/Exercice3", "words.txt");

        // Créez un fichier nommé words.txt avec plusieurs phrases.
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(words))) {
            bufferedWriter.write("Nam id turpis a mauris condimentum congue. Duis tristique sapien eget elit ornare egestas. Quisque ultricies pharetra neque, quis cursus lorem. ");
            bufferedWriter.newLine();
            bufferedWriter.write("Maecenas ut ullamcorper neque. Phasellus feugiat congue augue sed sollicitudin. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Écrivez un programme qui compte le nombre total de mots dans le fichier.
        int nWords = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(words))) {
            while (bufferedReader.ready()) {
                nWords += bufferedReader.readLine().split(" ").length;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Le fichier " + words.getName() + " contient " + nWords + " mots");
    }
}
