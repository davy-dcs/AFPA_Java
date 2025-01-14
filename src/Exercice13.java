import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {
        /*
        Demandez une note sur 20 à l'utilisateur, puis affichez l'appréciation correspondante :
16 à 20 : Très bien
12 à 15 : Bien
10 à 11 : Passable
<10 : Insuffisant
Entrée : 14
Sortie : Appréciation : Bien.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer une note sur 20");
        int a = scanner.nextInt();
        if (a >= 16) {
            System.out.println("Appréciation : Très bien");
        } else if (a >= 12) {
            System.out.println("Appréciation : Bien");
        } else if (a >= 10) {
            System.out.println("Appréciation : Passable");
        } else {
            System.out.println("Appréciation : Insuffisant");
        }
        scanner.close();
    }
}
