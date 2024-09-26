package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do FIlme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        if (incluidoNoPlano){
            System.out.println("O filme está incluído no plano");
        } else {
            System.out.println("O filme não está incluído no plano");
        }
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return (somaAvaliacoes/totalAvaliacoes);
    }
}
