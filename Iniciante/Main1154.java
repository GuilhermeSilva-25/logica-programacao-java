import java.util.Scanner;
import java.util.Locale;

public class Main1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            int valores = 0;
            double contador = 0.0;
            double media;

            while (true) {
                int n = sc.nextInt();

                if (n < 0) {
                    break;
                }

                valores += n;
                contador++;
            }

            media = valores / contador;

            System.out.printf("%.2f%n", media);
        }
    }
}