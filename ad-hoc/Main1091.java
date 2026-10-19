import java.util.Scanner;

public class Main1091 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int k = sc.nextInt();

                if (k == 0) {
                    break;
                }

                int n = sc.nextInt();
                int m = sc.nextInt();

                for (int i = 0; i < k; i++) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    if (x == n || y == m) {
                        System.out.println("divisa");
                    } else if (x > n && y > m) {
                        System.out.println("NE");
                    } else if (x < n && y > m) {
                        System.out.println("NO");
                    } else if (x > n && y < m) {
                        System.out.println("SE");
                    } else {
                        System.out.println("SO");
                    }
                }
            }
        }
    }
}
