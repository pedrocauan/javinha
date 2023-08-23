import javax.swing.JOptionPane;

public class TelaDeLogin {
    // == Opções de login
    static String[] loginOptions = new String[] { "Logar", "Criar Conta", "Apagar conta", "Sair" };
    // static String[] userOptions = new String[] { "Trocar de usuario", "Fazer
    // post", "Sair" }; //implementar futuramente
    static int selectedOption; // opção escolhida pelo usuario

    static boolean exit = false;
    static boolean isCreated = false; // verifica se a conta esta criada
    static boolean isLogged = false; // veverifica se a conta esta lotada
    static boolean isDeleted = false;

    public static void main(String[] args) throws Exception {

        // repete o programa até o usuario sair
        while (!exit) {
            selectedOption = JOptionPane.showOptionDialog(
                    null,
                    "LOGIN", /* Mensagem da janela */
                    "LOGIN", /* tiulo */
                    JOptionPane.DEFAULT_OPTION, // tipo de botao de opção
                    JOptionPane.INFORMATION_MESSAGE, // tipo de janela
                    null, // icone
                    loginOptions, // array com as opções
                    0 // valor inicial
            );

            switch (selectedOption) {
                // === BOTAO DE LOGAR ===
                case 0:
                    // valida se a conta foi criada
                    if (!isCreated) {
                        // valida se a conta não foi deletada
                        if(!isDeleted) {
                            JOptionPane.showMessageDialog(null, "Conta deletada");
                        }
                        JOptionPane.showMessageDialog(null, "Voce precisa criar a conta para fazer login");
                        break;
                    }
                    // entra se a conta nao estiver logada
                    if (!isLogged) {
                        if(isDeleted) {
                            JOptionPane.showMessageDialog(null, "Conta apagada durante a sessão, o logout foi feito automaticamente");
                            isLogged = false;
                            isDeleted = false;
                            break;
                        }

                        // Inicia a sessão de usuario logado
                        JOptionPane.showMessageDialog(null, "Logado com sucesso !!");
                        isLogged = true;
                        break;
                    }


                    JOptionPane.showMessageDialog(null,
                            "Ainda não temos uma tela de usuario logado, volte mais tarde !!");
                    exit = true;
                    break;
                // === BOTAO CRIAR A CONTA ===
                case 1:
                    // valida se a conta nao foi criada
                    if (!isCreated) {
                        JOptionPane.showMessageDialog(null, "Conta criada com sucesso");
                        isCreated = true;
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "Sua conta já foi criada");
                    break;
                // == BOTAO APGAR CONTA ==
                case 2:
                    if (!isCreated) {
                        JOptionPane.showMessageDialog(null, "Não existe conta criada pagar apagar !!");
                        break;
                    }
                    isCreated = false;
                    isLogged = false;
                    isDeleted = true;
                    JOptionPane.showMessageDialog(null, "Conta apagada com sucesso !!");
                    break;
                // == BOTAO SAIR ==
                default:
                    exit = true;
            }
        }

    }
}
