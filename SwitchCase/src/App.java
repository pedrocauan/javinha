import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String personagem = JOptionPane.showInputDialog(null, "Digite um personagem");
        String origem = "";
        String caminhoImagem = "";
        String nomeImagem = "";
        String informacoesPersonagem = "";
        switch(personagem.substring(0, 1).toUpperCase() + personagem.substring(1)) {
            case "Bulma":
                nomeImagem = "bulma-icone";
                origem = "Planeta terra";
                break;
            
            case "Goku":
                nomeImagem = "goku-icone";
                origem = "Planeta sayajin";
                break;

            case "Vegeta":
                nomeImagem = "vegeta-icone";
                origem = "Planeta sayajin";
                break;

            case "Kuririn":
                nomeImagem = "kuririn-icone";
                origem = "Planeta terra";
                break;

            case "Picolo":
                nomeImagem = "piccolo-icone";
                origem = "Planeta namekusei";
                break;
            default:
                nomeImagem = "default";
                origem = "desconhecida";
        }
        caminhoImagem = String.format("./src/imagens/%s.png", nomeImagem);
        System.out.println(caminhoImagem);
        ImageIcon icon = new ImageIcon(caminhoImagem);
        informacoesPersonagem = String.format("Nome do personagem: %s\nOrige: %s", personagem, origem);
        JOptionPane.showConfirmDialog(null, informacoesPersonagem, "Personagem", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

        //int diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Qual é o dia da semana ?"));
        /*
         *  1 - domingo -> final de semana
            2 - segunda
            3 - terça
            4 - quarta
            5 - quinta
            6 - sexta
            7 - sabado -> final de semana
         */
      /*   switch(diaSemana){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana");
                break;
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
        } */


        /*
         * if (personagem.equals("Vegeta")) {
         * } else if (personagem.equals("Goku")) {
         * System.out.println("Planeta Sayajin");
         * } else if (personagem.equals("Bulma")) {
         * System.out.println("Planeta sayajin");
         * } else if (personagem.equals("Picolo")) {
         * System.out.println("Planeta terra");
         * } else {
         * System.out.println("Planeta manecuseidim");
         * }
         * System.out.println("Origem desconhecida");
        */

       /*  switch (personagem) {
            case "Vegeta":
                System.out.println("Planeta Sayajin");
                break;
            case "Goku":
                System.out.println("Planeta sayajin");
                break;
            case "Bulma":
                System.out.println("Planeta terra");
                break;
            case "Picolo":
                System.out.println("Planeta manecuseidim");
                break;
            default:
                System.out.println("Origem desconhecida");
        } */
    }
}
