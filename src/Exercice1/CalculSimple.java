package Exercice1;

public class CalculSimple implements Calculable{
    @Override
    public double additionner(double a, double b) {
        return a+b;
    }

    @Override
    public double soustraire(double a, double b) {
        return a-b;
    }
}
