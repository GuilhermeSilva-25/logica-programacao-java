import java.util.Scanner;

public class Main1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < quantidade; i++) {
            int value = sc.nextInt();
            if (value >= 10 && value <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("%d in%n%d out%n", in, out);
        sc.close();
    }
}