public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2001;
        boolean incluidoNoPlano = true; //ou false
        double notaDoFilme = 9.9;
        String tipoPlano = "plus";

        if (anoDeLancamento > 2022){
            System.out.println("Filme de lançamento.");
        } else {
            System.out.println("Filme retrô");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
