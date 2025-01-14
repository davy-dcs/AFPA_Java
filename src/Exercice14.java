import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {
        /*
        Demandez à l'utilisateur une année et déterminez si elle est bissextile. Une année est bissextile si :
Elle est divisible par 4 et non divisible par 100, ou divisible par 400.
Entrée : 2024
Sortie : L'année 2024 est bissextile.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer une année");
        int year = scanner.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ) {
            System.out.printf("L'année %d est bissextile", year);
        } else {
            System.out.printf("L'année %d n'est pas bissextile", year);
        }
        scanner.close();
    }
}
