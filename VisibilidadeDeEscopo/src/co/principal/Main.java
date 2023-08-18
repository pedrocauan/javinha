package co.principal;

public class Main {
    // Visibilidade default -> somente classes ou arquivos q estejam no mesmo escopo de pacote podem acessar propriedades default
    // visibilidade public -> todos os packages do projeto podem enxergar
    // visibilidade private -> privada para todos os packages, somente a classe atual pode acessar essa variavel
    public static int x;

    public static void main(String[] args) {

    }
    public static void sum(int a, int b) {
        System.out.println(x);
    }
}