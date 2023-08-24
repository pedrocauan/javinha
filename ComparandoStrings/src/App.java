import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String password = "123456"; // 0010

        System.out.println("Digite a sua senha");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine(); // 0100
        // == não compara o conteúdo, ele compara referencia dos objetos
        // System.out.println(password == pass);
        String x = new String("123456"); // ENDEREÇO 0100
        String y =  new String("123456"); // ENDEREÇO 0010 
        System.out.println(x == y);

    }
}
