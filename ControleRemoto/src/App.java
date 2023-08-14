public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.play();
        c.abrirMenu();
    }
}

