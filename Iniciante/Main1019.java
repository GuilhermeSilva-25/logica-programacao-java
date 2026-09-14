import java.util.Scanner;

public class Main1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int horas = n / 3600;
        int sobra = n % 3600;
        int minutos = sobra / 60;
        int segundo = sobra % 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundo);
        sc.close();
    }
}
