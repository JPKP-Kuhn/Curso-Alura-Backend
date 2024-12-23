package br.com.alura.screenmatch.modelos;

public class OutroTitulo implements Comparable<OutroTitulo> {
    private String nome;

    public OutroTitulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(OutroTitulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}
