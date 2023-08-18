// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number = 10;
        calc(10, 5); //ARGUMENTOS

    }

    static void calc(int num1 /*parametro*/, int num2 /*parametro*/){
        // static void -> declaração padrao (falaremos depois)
        // sum -> NOME DA FUNÇÃO (poderia ser MADRUGUINHA ou qualquer outro nome)
        //() usamos para definir o que chegará naquela função
        //(tipo <nome>)
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }
}