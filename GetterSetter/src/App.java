public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();

        c1.setModelo("Bic");
        // c1.modelo = "bic";
        c1.setPonta(0.5f);
        // c1.ponta = "ponta";

        System.out.println("Tenho uma caneta " + c1.getModelo() + " com a ponta " + c1.getPonta());

    }
}
