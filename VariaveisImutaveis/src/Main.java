
//== VARIAVEIS IMUTÁVEIS (constantes) ==
// Qualquer variavel que nao pode ser mudada durante o código
// chama-se constantes
// no java, utiliza-se a palavra reservada final para declarar uma constante
public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159;

        // força o erro ao tentar reatribuir a variavel
        PI =30.24;
    }
}