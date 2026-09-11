import java.util.Scanner;

public class Main1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sumTotal = a + b;

        System.out.printf("SOMA = %d%n", sumTotal);

        sc.close();
    }
}