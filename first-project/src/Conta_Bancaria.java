import java.util.Scanner;

public class Conta_Bancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.printf("Seja bem vindo %s ! \n", nome);

        int escolha = 0;
        double valor, saldo = 0;

        System.out.println("""
                ************************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo conta:     Corrente
                Saldo inicial:  R$ %.2f
                ************************************
                """.formatted(nome, saldo));

        while (escolha != 4){
            System.out.println("""
                    Operação
                    1- Consultar Saldo
                    2- Receber valor
                    3- Transferir valor
                    4- sair
                    Digite a opção desejada:
                    """);
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    System.out.println(saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor: ");
                    valor = scanner.nextDouble();
                    saldo += valor;
                    System.out.printf("Agora o saldo é de R$%.2f ", saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor:");
                    valor = scanner.nextDouble();
                    if (valor > saldo){
                        System.out.println("Valor maior que o saldo");
                        break;
                    } else {
                        saldo -= valor;
                    }
                    System.out.printf("Agora o saldo é de %.2f", saldo);
                    break;
                default:
                    break;
            }
        }
    }
}
