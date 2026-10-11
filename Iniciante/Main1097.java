
public class Main1097 {

    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= 9; i += 2) {
            for (int j = n; j >= n - 2; j--) {
                System.out.printf("I=%d J=%d%n", i, j);
            }
            n += 2;
        }
    }
}
