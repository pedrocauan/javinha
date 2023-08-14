public class App {
    
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("bic", "azul", 0.4);

        c1.status();

        Caneta c2 = new Caneta("Faber Castel", "Laranja", 0.5);

        c2.status();

    }
}
