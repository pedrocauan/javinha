public class App {
    public static void main(String[] args) throws Exception {
        Compra c = new Compra(4, 250);
        System.out.println(c.getNumeroParcelas());
        System.out.println(c.getValorParcela());
        System.out.println(c.getValorTotal());

    }
}
