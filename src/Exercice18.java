import java.util.Scanner;

public class Exercice18 {
    public static void main(String[] args) {
        /*
        Demandez un nombre à l'utilisateur et utilisez une boucle pour compter le nombre de chiffres.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int n = scanner.nextInt();
        scanner.close();
        var nToArray = String.valueOf(n).toCharArray();
        System.out.printf("Le nombre %d contient %d chriffres", n, nToArray.length);
    }
}
