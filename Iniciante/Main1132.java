
import java.util.Scanner;

public class Main1132 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;

            if (x > y) {
                for (int i = y; i <= x; i++) {
                    if (i % 13 != 0) {
                        soma += i;
                    }
                }
            } else {
                for (int i = x; i <= y; i++) {
                    if (i % 13 != 0) {
                        soma += i;
                    }
                }
            }

            System.out.println(soma);
        }
    }
}
