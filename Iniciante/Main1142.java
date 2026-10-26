import java.util.Scanner;

public class Main1142 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int numeroInicioLinha = 1;

            for (int i = 0; i < n; i++) {
                System.out.printf("%d %d %d PUM%n", numeroInicioLinha, ++numeroInicioLinha, ++numeroInicioLinha);

                numeroInicioLinha += 2;
            }
        }
    }
}