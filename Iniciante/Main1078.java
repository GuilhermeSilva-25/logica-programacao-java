import java.util.Scanner;

public class Main1078 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int value = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", i, value, (i * value));
            }
        }
    }
}