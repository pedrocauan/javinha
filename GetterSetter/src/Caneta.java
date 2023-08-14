public class Caneta 
{
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //Construtor
    public Caneta() 
    {
        this.tampar(); // inicia a caneta tampada
        this.cor = "Azul";
    }
    //getters e setters
    public String getModelo()
    {
        return this.modelo;
    }

    public void setModelo(String m) 
    {
        this.modelo = m;
    }

    public double getPonta() 
    {
        return this.ponta;
    }

    public void setPonta(float p)
    {
        this.ponta = p;
    }

    //Manipulação da variavel tampar
    public void tampar()
    {
        this.tampada = true;
    }

    public void destampar() 
    {
        this.tampada = false;
    }

    //Mostra informações dos atributos da classe na tela
    public void status()
    {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("tampada: " + this.tampada);
        System.out.println("Cor: " + this.cor);
    }
}   
