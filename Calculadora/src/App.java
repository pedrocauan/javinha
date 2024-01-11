public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(1.5, 3.5);
        Calculadora calculadora2 = new Calculadora(6.5, 3.5);
        Calculadora calculadora3 = new Calculadora(1.5, 7.5);

        System.out.println(calculadora.n1.equals(calculadora3.n1));

    }
}
