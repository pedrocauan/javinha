import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int contador = 1;

        //contador++
        // - Imprime o valor atual de contador
        // - acrescenta 1 no contador

        //++contador
        // - Acrescenta 1 no contador
        // - Imprime o valor do contador depois do acrescimo

        //contador--
        // - Imprime o valor atual de contador
        // - diminui 1 no contador

        //--contador
        // - diminui 1 no contador
        // - imprime o valor do contador na tela
        /* 
        JOptionPane.showMessageDialog(null, ++contador, "matematica", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, contador, "matematica", JOptionPane.INFORMATION_MESSAGE);
        */

        int resultado = 2 * 5  + 3 * 4 - 8;
        JOptionPane.showMessageDialog(null, resultado);


    }
}
