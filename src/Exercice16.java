import java.util.Scanner;

public class Exercice16 {
    public static void main(String[] args) {
        /*
        Demandez un nombre n à l'utilisateur, puis calculez la somme des entiers de 1 à n en utilisant une boucle while
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;
        while (i<=n) {
            sum += i;
            i++;
        }
        System.out.printf("La somme des nombres de 1 à %d est %d." , n, sum);
        scanner.close();
    }
}
