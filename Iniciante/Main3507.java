import java.util.Scanner;

public class Main3507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long totalAnimais = sc.nextLong();
        long totalPatas = sc.nextLong();

        long totalTigres = (totalPatas - (2 * totalAnimais)) / 2;
        long totalGansos = totalAnimais - totalTigres;

        System.out.printf("%d%n%d%n", totalTigres, totalGansos);
        sc.close();
    }
}
