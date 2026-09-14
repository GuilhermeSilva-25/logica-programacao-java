import java.util.Scanner;
import java.util.Locale;

public class Main1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PESO_NOTA_A = 3.5;
        final double PESO_NOTA_B = 7.5;
        final double PESO_TOTAL = PESO_NOTA_A + PESO_NOTA_B;

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double media = ((a * PESO_NOTA_A) + (b * PESO_NOTA_B)) / PESO_TOTAL;

        System.out.printf("MEDIA = %.5f%n", media);

        sc.close();
    }

}
