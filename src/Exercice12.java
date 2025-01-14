import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        /*
        Demandez trois nombres à l'utilisateur, puis affichez le plus grand des trois.
Entrée : 3, 9, 7
Sortie : Le nombre le plus grand est 9.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un premier nombre");
        int a = scanner.nextInt();
        System.out.println("Entrer un deuxieme nombre");
        int b = scanner.nextInt();
        System.out.println("Entrer un troisieme nombre");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.printf("Le nombre le plus grand est %d", a);
        } else if (b > a && b > c) {
            System.out.printf("Le nombre le plus grand est %d", b);
        } else {
            System.out.printf("Le nombre le plus grand est %d", c);
        }
        scanner.close();
    }
}
