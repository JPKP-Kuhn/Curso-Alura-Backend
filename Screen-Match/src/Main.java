import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoMinutos(180);

        //Instanciar um objeto
        System.out.println(meuFilme.getNome());
        //Método da classe
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(7.8);
        meuFilme.avalia(8.9);
        meuFilme.avalia(9.7);
        System.out.println("Total de avaliações" + meuFilme.getTotalAvaliacoes());

        System.out.println(meuFilme.pegaMedia());
    }
}
