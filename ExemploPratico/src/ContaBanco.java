public class ContaBanco
{
    public int numeroConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Construtor
    public ContaBanco()
    {
        this.status = false;
        this.saldo = 0;
    }
    
    public void estadoAtual()
    {
        System.out.println("---------------------------------");
        System.out.println("conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Conta aberta? R: " + this.getStatus());
    }
    //metodos personalizados
    public void abrirConta(String t)
    {
        this.setTipo(t);
        this.setStatus(true);

        if ("CC".equals(t)) 
        {
            this.setSaldo(50);
        } 
        else if("CP".equals(t)){
            this.setSaldo(150);
        }
    }

    public void fecharConta()
    {
        if(this.getSaldo() > 0)
        {
            System.out.println("Conta não pode ser fechado pois ainda tem dinheiro");
        }
        else if(this.getSaldo() < 0)
        {
            System.out.println("conta não pode ser fechado pois está em divida");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() + " fechada com sucesso !!");
        }
    }


    public void depositar(double v)
    {
        if(this.getStatus())
        {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        }
        else
        {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    public void sacar(double v)
    {
        //permite o saque caso a conta esteja ativa
        if(this.getStatus())
        {
            //só permite o saque se o saldo for maior que o valor solicitado
            if(this.getSaldo() >= v)
            {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else 
            {
                System.out.println("Saldo insuficiente para saque !!");
            }
        }
        // informa a conta inativa
        else {
            System.out.println("Impossível sacar com uma conta inativa !!");
        }
    }

    public void pagarMensalidade()
    {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12; 
        } else if("CP".equals(this.getTipo())) {
            v = 20;
        }

        if(this.getStatus())
        {
            this.setSaldo(this.getSaldo() - v);
        }
        else
        {
            System.out.println("Impossível pagar mensalidade com uma conta fechada");
        }
    }


    //Getter e setter
     public void setNumConta(int n)
    {
        this.numeroConta = n;
    }

    public int getNumConta()
    {
        return this.numeroConta;
    }

    public void setTipo(String t)
    {
        this.tipo = t;
    }

    public String getTipo()
    {
        return this.tipo;
    }

    public void setDono(String dono)
    {
        this.dono = dono;
    }

    public String getDono()
    {
        return this.dono;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public boolean getStatus()
    {
        return this.status;
    }

}
