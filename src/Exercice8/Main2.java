package Exercice8;

import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /*
            Exercice 8 : Recherche d'un mot spécifique dans un fichier
            Objectif : Vérifier si un mot donné est présent dans un fichier.

            Créez un fichier search.txt contenant du texte.
            Écrivez un programme qui demande à l'utilisateur un mot à rechercher dans le fichier et affiche "Mot trouvé" ou "Mot non trouvé".
         */

        File search = new File("src/Exercice8", "search2.txt");

        // Créez un fichier search.txt contenant du texte.
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(search))) {
            bufferedOutputStream.write("Objectif : Vérifier si un mot donné est présent dans un fichier.\n".getBytes());
            bufferedOutputStream.write("Créez un fichier search.txt contenant du texte.\n".getBytes());
            bufferedOutputStream.write("Écrivez un programme qui demande à l'utilisateur un mot à rechercher dans le fichier et affiche \"Mot trouvé\" ou \"Mot non trouvé\".".getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Écrivez un programme qui demande à l'utilisateur un mot à rechercher dans le fichier et affiche "Mot trouvé" ou "Mot non trouvé".
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel mot recherchez-vous ?");
        String word = scanner.nextLine();
        scanner.close();
        if (search(search, word)) {
            System.out.println("Mot trouvé");
        } else {
            System.out.println("Mot non trouvé");
        }
    }

    private static boolean search(File file, String word) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (bufferedInputStream.available() > 0) {
                stringBuilder.appendCodePoint(bufferedInputStream.read());
            }
            if (stringBuilder.toString().toLowerCase().contains(word.toLowerCase())) return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
