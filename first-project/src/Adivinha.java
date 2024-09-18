import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        int random = new Random().nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int chute;
        System.out.println(random);
        for (int i = 0; i < 5; i++) {
            System.out.println("Adivinhe um número de 0 a 10: ");
            chute = scanner.nextInt();

            if (chute == random){
                System.out.println("Parabén você acertou!");
                break;
            } else if (chute < random) {
                System.out.println("É maior");
            } else {
                System.out.println("É menor");
            }
            if (i == 4){
                System.out.println("Que pena! Acabaram as tentativas");
            }
        }
    }
}
