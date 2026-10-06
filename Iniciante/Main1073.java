import java.util.Scanner;

public class Main1073 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int value = sc.nextInt();

            for (int i = 2; i <= value; i += 2) {
                System.out.printf("%d^2 = %d%n", i, (i * i));
            }
        }
    }
}