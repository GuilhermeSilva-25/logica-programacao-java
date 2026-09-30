import java.util.Scanner;

public class Main1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
            int value = sc.nextInt();
            if (value > 0) {
                positivo++;
            } else if (value < 0) {
                negativo++;
            }

            if (value % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.printf(
                "%d valor(es) par(es)%n%d valor(es) impar(es)%n%d valor(es) positivo(s)%n%d valor(es) negativo(s)%n",
                par, impar, positivo, negativo);
        sc.close();
    }
}