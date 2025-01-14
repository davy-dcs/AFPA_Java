import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        /*
        Demandez à l'utilisateur d'entrer son prénom, puis affichez :
Bonjour, [prénom] !
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Votre prénom");
        String fn = scanner.nextLine();
        System.out.printf("Bonjour, %s", fn);
    }
}
