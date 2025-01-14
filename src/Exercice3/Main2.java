package Exercice3;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        /*
            Exercice 3 : Comptage des mots dans un fichier
            Objectif : Lire un fichier et compter le nombre de mots qu’il contient.

            Créez un fichier nommé words.txt avec plusieurs phrases.
            Écrivez un programme qui compte le nombre total de mots dans le fichier.
         */

        File words = new File("src/Exercice3", "words2.txt");

        // Créez un fichier nommé words.txt avec plusieurs phrases.
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(words))) {
            bufferedOutputStream.write("Nam id turpis a mauris condimentum congue. Duis tristique sapien eget elit ornare egestas. Quisque ultricies pharetra neque, quis cursus lorem. \n".getBytes());
            bufferedOutputStream.write("Maecenas ut ullamcorper neque. Phasellus feugiat congue augue sed sollicitudin. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.".getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Écrivez un programme qui compte le nombre total de mots dans le fichier.
        int nWords = 0;
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(words))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (bufferedInputStream.available() > 0) {
                stringBuilder.appendCodePoint(bufferedInputStream.read());
            }
            nWords = stringBuilder.toString().split(" ").length;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Le fichier " + words.getName() + " contient " + nWords + " mots");
    }
}
