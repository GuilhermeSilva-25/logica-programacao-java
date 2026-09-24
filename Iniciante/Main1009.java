import java.util.Locale;
import java.util.Scanner;

public class Main1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();
        double comissao = totalVendas * 0.15;
        double salarioTotal = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
        sc.close();
    }
}