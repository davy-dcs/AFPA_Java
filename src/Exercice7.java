import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        /*
        Demandez à l'utilisateur son année de naissance et calculez son âge (en supposant que l'année actuelle est 2024).

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Votre année de naissance");
        int year = scanner.nextInt();
        System.out.println(2024 - year);
    }
}
