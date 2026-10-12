
import java.util.Scanner;

public class Main1099 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int value = sc.nextInt();

            for (int i = 0; i < value; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int menor;
                int maior;
                int sum = 0;

                if (x > y) {
                    maior = x;
                    menor = y;
                } else {
                    maior = y;
                    menor = x;
                }

                for (int j = menor + 1; j < maior; j++) {
                    if (j % 2 != 0) {
                        sum += j;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
