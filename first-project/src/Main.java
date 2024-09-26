import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Alô Mundo!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);


        //casting de double para inteiro
        double numeroDouble = 24.233;
        int castInteiro = (int) numeroDouble;
        System.out.println(castInteiro);

        //Completando a palavra
        char vogal = 'a';
        String palavra = "cas";
    
        palavra = palavra + vogal;
        System.out.println(palavra);

        //Calcular desconto
        double precoProduto = 50;
        double percentualDesconto = 0.1;
        double novoPreco = precoProduto * (1 - percentualDesconto);

        System.out.printf("O preço antes era de %.2fR$, com um desconto de %.2f equivale a %.2f", precoProduto, percentualDesconto, novoPreco);

        //Calcular área
        Scanner scanner = new Scanner(System.in);
        System.out.println(""" 
                Digite:
                1. Calcular área do quadrado
                2. Calcular área do círculo
                """);
        int escolha = scanner.nextInt();
        if (escolha == 1){
            System.out.println("Digite o lado do quadrado: ");
            int lado = scanner.nextInt();
            System.out.println(lado * lado);
        } else {
            System.out.println("Digite o raio do círculo: ");
            int raio = scanner.nextInt();
            System.out.println(Math.PI * Math.pow(raio, 2));
        }

        //Calcular fatorial
        System.out.println("Escolha um número para calcular o seu fatorial:");
        int numero = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero ; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);


        //Implementando a classe Nova Conta Bancaria
        Nova_Conta_Bancaria conta = new Nova_Conta_Bancaria();

        conta.setNumeroConta(12345);
        conta.setSaldo(500);
        conta.titular = "João";

        System.out.println("Conta do titula " + conta.titular + " Com saldo " + conta.getSaldo());
    }
}