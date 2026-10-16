import java.util.Scanner;
import java.util.Locale;

public class Main1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            final double PESO_NOTA_A = 2.0;
            final double PESO_NOTA_B = 3.0;
            final double PESO_NOTA_C = 5.0;
            final double PESO_NOTA_TOTAL = PESO_NOTA_A + PESO_NOTA_B + PESO_NOTA_C;

            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                double notaA = sc.nextDouble();
                double notaB = sc.nextDouble();
                double notaC = sc.nextDouble();

                double media = ((notaA * PESO_NOTA_A) + (notaB * PESO_NOTA_B) + (notaC * PESO_NOTA_C))
                        / PESO_NOTA_TOTAL;

                System.out.printf("%.1f%n", media);
            }

        }
    }
}