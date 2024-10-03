package br.com.jpk.classes;

public class ConversaoMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double ValorDolar) {
        double contacaoDolar = 5.47;
        double valorReal = ValorDolar * contacaoDolar;
        System.out.println("O valor em reais é R$" + valorReal);
    }
}
