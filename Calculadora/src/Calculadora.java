public class Calculadora {

    //wrappers -> tem a mesma função do tipo primitivo mas sao tipos de referencia
    Double n1;
    Double n2;

    public Calculadora(Double n1, Double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    Double soma(){
        return n1 + n2;
    }
}
