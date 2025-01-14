import java.util.Scanner;

public class Exercice17 {
    public static void main(String[] args) {
        /*
        Demandez un nombre à l'utilisateur, puis affichez sa table de multiplication de 1 à 10.

         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d * %d = %d \n", i, n, i*n);
        }
    }
}
