
import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        /*
    Convertisseur C en F
    (0°C × 9/5) + 32 = 32°F
    (32°F − 32) × 5/9
     */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter c pour convertir des F en C et f pour convertir des C en F");
        String conver = scanner.nextLine();

        switch (conver) {
            case "c":
                System.out.println("Entrer le farhen");
                int f = scanner.nextInt();
                System.out.printf("%d F est egale a %d C", f, (f - 32) * 5/9);
                break;
            case "f":
                System.out.println("Entrer le celsius");
                int c = scanner.nextInt();
                System.out.printf("%d C est egale a %d F", c, (c * 9/5) + 32);
                break;
            default:
                System.out.println("Aie ! quelque chose ne va pas");
        }
    }

}
