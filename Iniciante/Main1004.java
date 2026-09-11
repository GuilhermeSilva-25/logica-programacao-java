import java.util.Scanner;

public class Main1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        int prod = value1 * value2;

        System.out.printf("PROD = %d%n", prod);

        sc.close();
    }
}
