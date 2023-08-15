
import javax.swing.JOptionPane;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        /* Cria um número entre 1 e 3
        double dado6lados =  1 +  (int) (Math.random()  * 3); // Menos performatico
        JOptionPane.showMessageDialog(null, dado6lados);
         */


        //Gera um dado
        Random gerador = new Random(6); // seed garante que o numero passado no parametro do construtor tera sempre o mesmo 
        //Pega as faces do dado
        String facesString = JOptionPane.showInputDialog(null, "Quantas faces tem o dado?"); 
        int facesDado = Integer.parseInt(facesString);

        //gera a rolagem do dado
        int resultado = 1 + gerador.nextInt(5);
        int numero = 1 + gerador.nextInt(facesDado); //Gera um inteiro de 1 a 6

        JOptionPane.showMessageDialog(null, "voce  tirou " + numero + " no dado"   );
        
    }
}
