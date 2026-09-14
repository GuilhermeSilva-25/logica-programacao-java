import java.util.Scanner;
import java.util.Locale;

public class Main1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final int RENDIMENTO_POR_LITRO = 12;

        int tempoViagemHoras = sc.nextInt();
        int velocidadeMedia = sc.nextInt();
        int distanciaPercorrida = velocidadeMedia * tempoViagemHoras;
        double combustivelGasto = (double) distanciaPercorrida / RENDIMENTO_POR_LITRO;

        System.out.printf("%.3f%n", combustivelGasto);
        sc.close();
    }
}