import java.util.Scanner;
import java.util.Locale;

public class Main1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int valoresPositivos = 0;
        for (int i = 1; i <= 6; i++) {
            double value = sc.nextDouble();
            if (value > 0) {
                valoresPositivos++;
            }
        }
        System.out.printf("%d valores positivos%n", valoresPositivos);
        sc.close();
    }
}