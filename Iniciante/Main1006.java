import java.util.Locale;
import java.util.Scanner;

public class Main1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final int PESO_NOTA_A = 2;
        final int PESO_NOTA_B = 3;
        final int PESO_NOTA_C = 5;
        final int SOMA_PESOS = PESO_NOTA_A + PESO_NOTA_B + PESO_NOTA_C;

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double mediaAluno = ((a * PESO_NOTA_A) + (b * PESO_NOTA_B) + (c * PESO_NOTA_C)) / SOMA_PESOS;

        System.out.printf("MEDIA = %.1f%n", mediaAluno);

        sc.close();
    }
}
