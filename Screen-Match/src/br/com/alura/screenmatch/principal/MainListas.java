package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.text.CollationElementIterator;
import java.util.*;

public class MainListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(9);
        var novoFilme = new Filme("Dogville", 2003);
        novoFilme.avalia(7);
        Serie serie = new Serie("Scott Pilgrim contra o mundo", 2023);

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(novoFilme);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + lista);

    }
}