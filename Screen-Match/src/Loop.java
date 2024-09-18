import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota;
        int totalNotas = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota:");
            nota = leitura.nextDouble();
            media += nota;
        }
        System.out.printf("Media de avaliações: %.2f \n", media/3);

        nota = 0;
        media = 0;
        while(nota != -1){
            System.out.println("Digite a nota:");
            nota = leitura.nextDouble();
            if (nota != -1) {
                media += nota;
                totalNotas++;
            }
        }
        System.out.printf("Media de avaliações: %.2f \n", media/totalNotas);

    }
}
