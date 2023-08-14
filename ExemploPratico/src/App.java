public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Joao");
        p1.abrirConta("CC");
        
        p1.depositar(100); // 150
        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP");
        
        p2.estadoAtual();
        p2.depositar(500); // 650
        p2.sacar(1000); // 550

    }
}
