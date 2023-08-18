
// quando uma variavel é declarada dentro de uma abertura e fechamento de caves
// esta variavel pertence a um escopo
// ela só pode ser enxergada dentro do seu próprio escopo ou em um escopo que acesse o escopo cujo qual
// ela está dentro

public class Main {
    public static void main(String[] args) {
        //ESCOPO DE variaveis
        int x;

        if(false) {
            x = 10; //variavel local
        } else {
            x = 2;
        }
        System.out.println(x);
    }
}