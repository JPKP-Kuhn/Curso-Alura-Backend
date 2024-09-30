import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoMinutos(180);
        System.out.println("Duração do filme " + meuFilme.getNome() + " é de " + meuFilme.getDuracaoMinutos() +" min");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoMinutos(200);

        //Instanciar um objeto
        System.out.println(meuFilme.getNome());
        //metodo da classe
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(7.8);
        meuFilme.avalia(8.9);
        meuFilme.avalia(9.7);
        System.out.println("Total de avaliações" + meuFilme.getTotalAvaliacoes());

        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Scott Pilgrim contra o mundo");
        serie.setAnoDeLancamento(2023);
        serie.exibeFichaTecnica();
        serie.setTemporadas(1);
        serie.setEpisodiosPorTemporada(8);
        serie.setMinutosPorEpisodio(24);

        System.out.println("Duração total da série: " + serie.getDuracaoMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(serie);
        System.out.println(calculadoraDeTempo.getTempoTotal());

    }
}
