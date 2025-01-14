import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        /*
        Demandez à l'utilisateur la longueur et la largeur d'un rectangle, puis affichez son aire.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer longueur");
        float longueur = scanner.nextFloat();
        System.out.println("Entrer largeur");
        float largeur = scanner.nextFloat();
        System.out.println(longueur*largeur);
    }
}
