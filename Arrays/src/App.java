import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String[] loginOptions = new String[] { "Logar", "Criar Conta", "Apagar conta", "Sair" };
        String[] userOptions = new String[] { "Trocar de usuario", "Fazer post", "Sair" };
        int selectedOption; // opção escolhida pelo usuario

        boolean exit = false;
        boolean isCreated = false; // verifica se a conta esta criada
        boolean isLogged = false; // veverifica se a conta esta lotada
        boolean isDeleted = false;

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
                        //se a conta nao foi criada, ela pode ser sido criada mas deletada durante a sessão
                        if (isDeleted) {
                            JOptionPane.showMessageDialog(null, "Sua conta foi deletada durante a sessão ");
                            isLogged = false;
                            isDeleted = false;
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Voce precisa criar a conta para fazer login");
                        break;
                    }
                    // entra se a conta nao estiver logada
                    if (!isLogged) {
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
