public class Caneta 
{
    private String modelo;
    private float ponta;

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

    public void status()
    {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
    }
}   
