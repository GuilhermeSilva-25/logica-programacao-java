import java.util.Scanner;
import java.util.Locale;

public class Main1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double valorConta = 0.0;

        switch (codigo) {
            case 1:
                valorConta = calcularConta(4.00, quantidade);
                break;
            case 2:
                valorConta = calcularConta(4.50, quantidade);
                break;
            case 3:
                valorConta = calcularConta(5.00, quantidade);
                break;
            case 4:
                valorConta = calcularConta(2.00, quantidade);
                break;
            case 5:
                valorConta = calcularConta(1.50, quantidade);
                break;
        }
        System.out.printf("Total: R$ %.2f%n", valorConta);
        sc.close();
    }

    public static double calcularConta(double valor, int quantidade) {
        return valor * quantidade;
    }
}
