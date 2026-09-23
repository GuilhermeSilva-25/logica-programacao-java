import java.util.Scanner;

public class Main3500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero = sc.next();
        System.out.printf("Invertido = %c%c%c%n", numero.charAt(2), numero.charAt(1), numero.charAt(0));
        sc.close();
    }
}