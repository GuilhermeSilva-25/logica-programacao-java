import java.util.Scanner;

public class Main1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            int valor = sc.nextInt();

            if (valor > maior) {
                maior = valor;
            }
        }

        System.out.printf("%d eh o maior%n", maior);
        sc.close();
    }
}