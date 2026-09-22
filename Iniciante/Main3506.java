import java.util.Scanner;

public class Main3506 {
    static final int MAX = 10000000;
    static boolean[] isPrimo = new boolean[MAX + 1];
    static int[] contarPrimos = new int[MAX + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        computarCrivo();
        computarSomaPrefixos();

        int numeroPergutas = sc.nextInt();
        for (int i = 0; i < numeroPergutas; i++) {
            int inicioIntervalo = sc.nextInt();
            int fimIntervalo = sc.nextInt();

            int resposta = contarPrimos[fimIntervalo] - contarPrimos[inicioIntervalo - 1];

            System.out.println(resposta);
        }
        sc.close();
    }

    public static void computarCrivo() {
        for (int i = 2; i <= MAX; i++) {
            isPrimo[i] = true;
        }
        for (int p = 2; p * p <= MAX; p++) {
            if (isPrimo[p]) {
                for (int i = p * p; i <= MAX; i += p) {
                    isPrimo[i] = false;
                }
            }
        }
    }

    public static void computarSomaPrefixos() {
        for (int i = 1; i <= MAX; i++) {
            contarPrimos[i] = contarPrimos[i - 1];
            if (isPrimo[i]) {
                contarPrimos[i]++;
            }
        }
    }
}
