import java.util.Scanner;

public class Main3520 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();

        if (value % 2 == 0) {
            value++;
        } else {
            value += 2;
        }

        System.out.println(value);
        sc.close();
    }
}