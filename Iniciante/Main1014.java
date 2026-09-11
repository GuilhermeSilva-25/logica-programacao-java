import java.util.Scanner;
import java.util.Locale;

public class Main1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int kmTotal = sc.nextInt();
        double combustivelGasto = sc.nextDouble();
        double consumoMedio = kmTotal / combustivelGasto;

        System.out.printf("%.3f km/l%n", consumoMedio);

        sc.close();
    }
}