public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalAvaliacoes;
    int duracaoMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do FIlme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        if (incluidoNoPlano){
            System.out.println("O filme está incluído no plano");
        } else {
            System.out.println("O filme não está incluído no plano");
        }
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return (somaAvaliacoes/totalAvaliacoes);
    }
}
