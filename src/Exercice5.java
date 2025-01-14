import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        /*
        Demandez à l'utilisateur deux nombres et affichez leur somme.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un premier nombre");
        int a = scanner.nextInt();
        System.out.println("Entrer un deuxieme nombre");
        int b = scanner.nextInt();
        System.out.println(a+b);
    }
}
