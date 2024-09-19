public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoMinutos = 180;

        //Instanciar um objeto
        System.out.println(meuFilme.nome);
        //Método da classe
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(7.8);
        meuFilme.avalia(8.9);
        meuFilme.avalia(9.7);
        System.out.println(meuFilme.somaAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);

        System.out.println(meuFilme.pegaMedia());
    }
}
