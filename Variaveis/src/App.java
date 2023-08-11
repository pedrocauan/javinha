public class App {
    public static void main(String[] args) throws Exception {
        //tipos de dados

        // inteiro
        byte numeroPequeno = -128; //vai de -128 a 128
        short numeroShort = 32767; //vai de -32767 a 32767
        int numeroInteiro = -2147483647; //vai de -2147483647 a 2147483647
        long numeroEnorme = 01340431034101304l; //vai até um numero enorme

        //float
        float peso = 78.7f; 
        double pi = 3.141516;

        //caracteres
        char letra = '(';

        // variavel boleana
        boolean estouComFome = true;

        //Variaveis do tipo String
        String texto = "aaa";
        

        System.out.println(numeroPequeno);
        System.out.println(numeroShort);
        System.out.println(numeroInteiro);
        System.out.println(texto);
    }
}
