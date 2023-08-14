public class ContaBanco
{
    public int numeroConta;
    protected char tipo; // c -> corrente | p-> poupança
    private String dono;
    private boolean status; // true -> ativa | false -> inativa
    private double saldo;

    public ContaBanco(int numeroConta, char tipo, String dono, boolean status)
    {
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        this.dono = dono;
        this.status = true; //Abre a conta quando o construtor é chamado
        this.saldo = 0; // inicia a conta sem saldo
    }
    //================= Getters =================
    public int getNumeroConta()
    {
        return numeroConta;
    }
    public char getTipo()
    {   
        return tipo;
    }

    public boolean getStatus()
    {
        return status;
    }

    public double getSaldo()
    {
        return saldo;
    }

        public String getDono()
    {
        return dono;
    }

    //================ Setters ====================
    public void setNumeroConta(int numeroConta)
    {
        this.numeroConta = numeroConta;
    }

    public void setTipo(char tipo)
    {
        this.tipo = tipo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    public void setDono(String dono)
    {
        this.dono = dono;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    // atividades bancarias
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
