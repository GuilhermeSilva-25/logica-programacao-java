import java.util.Scanner;

public class Main3499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroBaguncas = sc.nextInt();

        if (numeroBaguncas <= 3) {
            System.out.println("vai ganhar o biscoito");
        } else {
            System.out.println("vai ficar sem o biscoito");
        }
        sc.close();
    }
}
