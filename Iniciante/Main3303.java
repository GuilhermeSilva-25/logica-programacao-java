
import java.util.Scanner;

public class Main3303 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String palavra = sc.nextLine();
            if (palavra.length() >= 10) {
                System.out.println("palavrao");
            } else {
                System.out.println("palavrinha");
            }
        }
    }
}
