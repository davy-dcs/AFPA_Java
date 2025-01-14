import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        /*
        Demandez à l'utilisateur d'entrer :
Un adjectif
Un nom
Un verbe

 Affichez une phrase en utilisant ces trois mots (par exemple : "Le [nom] est très [adjectif] et aime [verbe] !").

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un adjectif");
        String adjectif = scanner.nextLine();
        System.out.println("Entrer un nom");
        String nom = scanner.nextLine();
        System.out.println("Entrer un verbe");
        String verbe = scanner.nextLine();

        System.out.printf("Le %s est très %s et aime %s !", nom, adjectif, verbe);
    }
}
