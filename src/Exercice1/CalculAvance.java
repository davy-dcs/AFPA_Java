package Exercice1;

public class CalculAvance implements Calculable{
    @Override
    public double additionner(double a, double b) {
        return a+b;
    }

    @Override
    public double soustraire(double a, double b) {
        return a-b;
    }

    public double multiplier(double a, double b) {
        return a*b;
    }

    public double diviser(double a, double b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("impossible de diviser par 0");
        }
        return a;
    }
}
