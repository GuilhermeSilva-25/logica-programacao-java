
import java.util.Scanner;

public class Main1134 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int alcool = 0;
            int gasolina = 0;
            int diesel = 0;

            while (true) {
                int tipo = sc.nextInt();

                switch (tipo) {
                    case 1:
                        alcool++;
                        break;
                    case 2:
                        gasolina++;
                        break;
                    case 3:
                        diesel++;
                        break;
                    case 4:
                        System.out.println("MUITO OBRIGADO");
                        System.out.println("Alcool: " + alcool);
                        System.out.println("Gasolina: " + gasolina);
                        System.out.println("Diesel: " + diesel);
                        return;
                    default:
                        break;
                }
            }
        }
    }
}
