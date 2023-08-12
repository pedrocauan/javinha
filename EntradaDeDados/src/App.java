import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //String jogo;
        String elo;
        int tier;
        String campeao, valor;

        // objeto para acessar a entrada
        Scanner leitor = new Scanner(System.in);
        //  configura o enter para ser o que vai definir a quebra de linha
        /* 
        leitor.useDelimiter("[\r\n]+");
        
        System.out.print("Qual é o seu jogo do momento: ");
        jogo = leitor.next();

        System.out.println("O jogo é: " + jogo);*/

        /* 
        System.out.print("Qual é o seu elo: ");
        elo = leitor.nextLine();

        System.out.print("Qual é o seu tier: ");
        valor = leitor.nextLine();
        // converte double  pra inteiro
        Integer.parseInt(valor);


        System.out.print("Qual é o seu campeão preferido: ");
        campeao = leitor.nextLine();

        System.out.format("\nVoce é mono %s  no elo %s %d", campeao, elo, tier);
        */

        // Janela pra pegar dados
        String filme =  JOptionPane.showInputDialog(null, "Qual seu filme prefiro", "Titulo", JOptionPane.QUESTION_MESSAGE);
        String texto = JOptionPane.showInputDialog(null, "Digite um numero");
        int numero = Integer.parseInt(texto);
        numero *= 2;
        // janela pra mostrar dados
        JOptionPane.showMessageDialog(null, String.format("%s\na soma é %s", filme, numero));
    }
}
