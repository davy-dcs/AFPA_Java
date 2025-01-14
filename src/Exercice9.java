import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        /*
        Demandez à l'utilisateur deux nombres et une opération (+, -, *, /), puis effectuez cette opération sur les deux nombres.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int a = scanner.nextInt();
        System.out.println("Entrer un autre nombre");
        int b = scanner.nextInt();

        System.out.println("Entrer un opérateur");

        String o = scanner.next();

        switch (o) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Entrer un opérateur valide");
        }
    }
}
