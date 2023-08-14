public class ContaBanco
{
    private int numeroConta;
    private char tipo;
    private String dono;
    private boolean status; // true -> ativa | false -> inativa
    private double saldo;

    public ContaBanco(int numeroConta, char tipo, String dono, boolean status)
    {
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        this.dono = dono;
        this.status = status;
    }

    public void abrirConta()
    {

    }

    public void fecharConta()
    {

    }

    public void depositar()
    {

    }

    public double sacar()
    {
        return 0;
    }

    public void pagarMensal()
    {
        
    }

}
