import java.util.Scanner;

public class Main1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if (value % 2 == 0) {
            value++;
        }

        for (int i = 0; i < 6; i++ ) {
            System.out.println(value);
            value += 2;
        }

        sc.close();
    }
}