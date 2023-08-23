public class App {
    public static void main(String[] args) throws Exception {
        String x = "Olá mundo, este e o novo mundo     ";

        System.out.println(x.length());
        System.out.println(x + " concatenada");

        System.out.println(x.contains("novo"));
        //começo de uma stirng
        System.out.println(x.indexOf("mundo"));

        System.out.println(x.lastIndexOf("mundo"));
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        //remove os espaços no começo e final da string
        System.out.println(x.trim());
        System.out.println(x.substring(9));
        //comparação de strings
        System.out.println(x.equals("Olá"));

    }
}
