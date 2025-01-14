import java.util.Scanner;

public class Exercice19 {
    public static void main(String[] args) {
        /*
        Faites deviner un nombre entre 1 et 100 (prédéterminé) à l'utilisateur. Indiquez à chaque tentative si le nombre est trop grand, trop petit ou correct.

         */
        int r = (int) (Math.random() * 100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deviner un nombre");
        int devine;
        do {
            devine = scanner.nextInt();
            if (devine == r) {
                System.out.println("Correct");
            } else if (devine < r) {
                System.out.println("Trop petit");
            } else {
                System.out.println("Trop grand");
            }
        } while (devine != r);
        scanner.close();
    }
}
