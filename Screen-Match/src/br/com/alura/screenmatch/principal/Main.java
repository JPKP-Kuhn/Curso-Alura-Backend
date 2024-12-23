package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        //meuFilme.setNome("O Poderoso Chefão");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoMinutos(180);
        System.out.println("Duração do filme " + meuFilme.getNome() + " é de " + meuFilme.getDuracaoMinutos() +" min");

        Filme outroFilme = new Filme("Avatar", 2023);
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoMinutos(200);

        //Instanciar um objeto
        System.out.println(meuFilme.getNome());
        //metodo da classe
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(7.8);
        meuFilme.avalia(8.9);
        meuFilme.avalia(9.7);
        System.out.println("Total de avaliações " + meuFilme.getTotalAvaliacoes());

        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie("Scott Pilgrim contra o mundo", 2023);
        //serie.setAnoDeLancamento(2023);
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

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNome("Scott Pilgrim contra o mundo");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var novoFilme = new Filme("Dogville", 2003);
        novoFilme.setDuracaoMinutos(200);
        novoFilme.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        listaDeFilmes.add(novoFilme);
    System.out.println(listaDeFilmes.get(2));

        
    }
}
