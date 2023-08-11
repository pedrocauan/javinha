public class App {
    public static void main(String[] args) throws Exception {
        String filme = "vingadores";
        int anoLancamento = 2015;
        int duracao = 240;
        float notaCritica = 8.7f;
        char letraInicial = 'V';
        boolean foiSucesso = true;

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(duracao);
        System.out.println(notaCritica);
        System.out.println(letraInicial);
        System.out.println(foiSucesso);
        
        System.out.println("O filme " + filme);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Nota: " + notaCritica);
        System.out.println("Foi um sucesso "  + foiSucesso);
        //concatenação clássica
        System.out.println("O filme " + filme +" lançado em " + anoLancamento + " Tem uma duração de " + duracao + " minutos");
        //Saida formatada
        System.out.format("O filme %s lançado em %d tem uma duração de %d minutos\n", filme, anoLancamento, duracao);

        //A Função format da classe String também faz esse papel caso seja necessário realizar essa formatação e guardar em uma variavel
        String texto = "O filme " + filme +" lançado em " + anoLancamento + " Tem uma duração de " + duracao + " minutos";
        String textoFormatado = String.format("O filme %s lançado em %d tem uma duração de %d minutos\n", filme, anoLancamento, duracao);
        System.out.format("%s \n %s", texto, textoFormatado);
        
        // moda antiga
        String canal = " 98NOOT ";
        String mensagem1 = "SE inscreva no canal";
        String mensagem2 = "Obrigado \\o";
        String mensagemFinal = mensagem1 + canal + mensagem2;

        System.out.println(mensagemFinal);


    }
}
