//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: O Senhor dos Anéis: A sociedade do Anel");
        String nomeFilme = "O Senhor dos Anéis: A sociedade do Anel";

        int anoDeLancamento = 2001;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true; //ou false
        double notaDoFilme = 9.9;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                O filme '%s' é de fantasia fantástica
                Foi muito aclamado pelo público, recebeu prêmio de melhores efeitos
                Um grupo de aventureiros precisa destruir um anel.
                """.formatted(nomeFilme);
        System.out.println(sinopse);

        int classificacao = (int) media / 2;
        System.out.println(classificacao);
    }
}