import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        /*
        Écrivez un programme qui demande un nombre à l'utilisateur et indique si ce nombre est pair ou impair.
Entrée : 5
Sortie : Le nombre 5 est impair.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int a = scanner.nextInt();
        if ( a%2 == 0 ) {
            System.out.printf("Le nombre %d est pair", a);
        } else {
            System.out.printf("Le nombre %d est impair", a);
        }
        scanner.close();
    }
}
