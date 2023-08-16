import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // int idade = 18;
        /*
         * ==== RELACIONAIS ===
         *  > - maior que
         * < - menor que
         * >= - maior igual
         * <= - menor igual
         * == igual
         * != diferente de
         * 
         * === LÓGICOS ===
         * &&
         * ||
         * ! 
         * ^
         */
        //Credenciais ultra secretas para entrar no projeto
         String usuario = "a";
         String senha = "a";

         //O que o usuario digitou
         String usuarioDigitado = JOptionPane.showInputDialog(null, "Digite o usuario secreto");
         String senhaDigitada = JOptionPane.showInputDialog(null, "Digite a senha secreta");

         //valida o login
         /*O metodo equals valida se o valor do endereço de memoria de duas strings sao iguais */
         boolean loginCorreto  = usuarioDigitado.equals(usuario) && senhaDigitada.equals(senha);
         System.out.println("String ? R: " + usuarioDigitado instanceof String);
         System.out.println("String ? R: " + senhaDigitada instanceof String);


         //mensagem de autenticação
         JOptionPane.showMessageDialog(null, loginCorreto ? "Logado com sucesso" : "Usuario ou senha incorretos");
    
         /*    int episodiosAssistidos = 760;
        int totalEpisodios = 760;

        boolean terminou = episodiosAssistidos == totalEpisodios;
        JOptionPane.showMessageDialog(null, termin ou);*/
    }
}
