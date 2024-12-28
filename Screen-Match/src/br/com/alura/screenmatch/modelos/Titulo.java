package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    protected String nome;
    @SerializedName("Year")
    protected int anoDeLancamento;
    protected boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.parseInt(meuTituloOmdb.year());
        this.duracaoMinutos = Integer.parseInt(meuTituloOmdb.runtime().substring(0, 2));
    }

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

    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        if (incluidoNoPlano) {
            System.out.println("O filme está incluído no plano");
        } else {
            System.out.println("O filme não está incluído no plano");
        }
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        return (somaAvaliacoes / totalAvaliacoes);
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", duracaoMinutos=" + duracaoMinutos +
                '}';
    }
}
