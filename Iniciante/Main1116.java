import java.util.Locale;
import java.util.Scanner;

public class Main1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            int contador = sc.nextInt();

            for (int i = 0; i < contador; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                if (y == 0) {
                    System.out.println("divisao impossivel");
                } else {
                    double divisao = x / y;
                    System.out.printf("%.1f%n", divisao);
                }
            }
        }
    }
}