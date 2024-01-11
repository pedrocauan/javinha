public class Compra {
    int valorTotal;
    int numeroParcelas;
    
    public int getNumeroParcelas() {
        return numeroParcelas;
    }


    public int getValorTotal() {
        return valorTotal;
    }

    public int getValorParcela() {
        return valorTotal / numeroParcelas;
    }
    //A vista
    public Compra(int valor){
        valorTotal = valor;
        numeroParcelas = 1;
    }

    // parcelado
    public Compra(int qntParcelas, int valorParcela) {
        numeroParcelas = qntParcelas;
        valorTotal = valorParcela * qntParcelas;
    }
    
}