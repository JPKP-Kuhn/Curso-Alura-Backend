import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCEP consulta = new ConsultaCEP();

        System.out.println("Digite o CEP que deseja consultar: ");
        String cep = scanner.nextLine();

        try {
            Endereco novoEndereco = consulta.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }


    }
}