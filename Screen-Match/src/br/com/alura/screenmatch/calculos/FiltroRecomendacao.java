package br.com.alura.screenmatch.calculos;


public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Bem avaliado no momento");
        } else {
            System.out.println("Guarde para assistir depois");
        }
    }
}
