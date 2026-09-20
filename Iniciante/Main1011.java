
import java.util.Locale;
import java.util.Scanner;

public class Main1011 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;
        final double MULTIPLICADOR_VOLUME_ESFERA = 4.0 / 3.0;
        double raio = sc.nextDouble();
        double volume = MULTIPLICADOR_VOLUME_ESFERA * PI * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f%n", volume);
        sc.close();
    }
}
