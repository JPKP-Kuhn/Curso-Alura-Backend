package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(@org.jetbrains.annotations.NotNull Filme f){
//        tempoTotal += f.getDuracaoMinutos();
//    }
//
//    public void inclui(@org.jetbrains.annotations.NotNull Serie s){
//        tempoTotal += s.getDuracaoMinutos();
//    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoMinutos();
    }
}
