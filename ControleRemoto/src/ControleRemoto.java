public class ControleRemoto implements IControlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto()
    {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    //Getter e setter
    private void setVolume(int volume)
    {
        this.volume = volume;
    }

    private int getVolume()
    {
        return this.volume;
    }

    private void setLigado(boolean ligado)
    {
        this.ligado = ligado;
    }

    private boolean isLigado()
    {
        return this.ligado;
    }

    private void setTocando(boolean tocando)
    {
        this.tocando = tocando;
    }

    private boolean isTocando()
    {
        return this.tocando;
    }
    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        // TODO Auto-generated method stub
        System.out.println("-------- ABRINDO MENU -------");
        System.out.println("Está ligado ? " + this.isTocando());
        System.out.println("Esta tocando ? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        // mostra barrinha na tela de acordo com o volume
        for(int i = 0; i < this.getVolume(); i+=10)
        {
            System.out.print("|");
        }
        System.out.println();
    }
    @Override
    public void fecharMenu() {
        if(this.isLigado())
        // TODO Auto-generated method stub
        System.out.println("Fechando menu...");
        
    }
    @Override
    public void maisVolume() {
        // TODO Auto-generated method stub
        if(this.isLigado())
        {
            this.setVolume(this.getVolume() + 5);
        }
        
    }
    @Override
    public void menosVolume() {
        // TODO Auto-generated method stub
        if(this.isLigado())
        {
            this.setVolume(this.getVolume() - 5);
        }
        
    }
    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub
        if(this.isLigado() && this.getVolume() > 0)
        {
            setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        // TODO Auto-generated method stub
        
        if(this.isLigado() && this.getVolume() == 0)
        {
            setVolume(50);
        }
        
    }
    @Override
    public void play() {
        // TODO Auto-generated method stub
        if(this.isLigado() && !(this.isTocando()))
        {
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
        // TODO Auto-generated method stub
        if(this.isLigado() && this.isTocando())
        {
            this.setTocando(false);
        }
        
    }
    
}
