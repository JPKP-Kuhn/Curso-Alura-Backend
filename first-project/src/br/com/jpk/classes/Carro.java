package br.com.jpk.classes;

public class Carro {
    private String nomeModelo;
    private double preco1;
    private double preco2;

    public double getPreco2() {
        return preco2;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public double getPreco1() {
        return preco1;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }


    private double precoMedioDeCadaAno;

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double mediaDePreco(){
        return (preco1 + preco2)/2;
    }


}
