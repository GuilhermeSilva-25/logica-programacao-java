import java.util.Scanner;
import java.util.Locale;

public class Main1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double areaTriangulo = calcularAreaTriangulo(a, c);
        double areaCirculo = calcularAreaCirculo(c);
        double areaTrapezio = calcularAreaTrapezio(a, b, c);
        double areaQuadrado = calcularAreaQuadrado(b);
        double areaRetangulo = calcularAreaRetangulo(a, b);

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        sc.close();
    }

    public static double calcularAreaTriangulo(double a, double c) {
        return (a * c) / 2;
    }

    public static double calcularAreaCirculo(double c) {
        final double PI = 3.14159;
        return PI * (c * c);
    }

    public static double calcularAreaTrapezio(double a, double b, double c) {
        return (a + b) * c / 2;
    }

    public static double calcularAreaQuadrado(double b) {
        return b * b;
    }

    public static double calcularAreaRetangulo(double a, double b) {
        return a * b;
    }
}