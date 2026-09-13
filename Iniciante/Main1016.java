import java.util.Scanner;

public class Main1016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        final int MINUTOS_POR_KM = 2;
        int tempo = distancia *  MINUTOS_POR_KM;

        System.out.printf("%d minutos%n", tempo);
        sc.close();
    }
}
