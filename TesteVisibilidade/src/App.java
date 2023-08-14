import novo.pacote.dois.ClasseDois;
import novo.pacote.dois.ClasseDentroDaClasseDois;
import novo.pacote.um.ClasseUm;
import novo.pacote.um.ClasseUmDentroDaClasseUm;

public class App {
    
    ClasseDois obj = new ClasseDois();
    ClasseDentroDaClasseDois obj2 = new ClasseDentroDaClasseDois();

    // Não é acessível na main pois  sem a visibilidade publica ele  só é acessível dentro do próprio pacote 
    ClasseUm obj3 = new ClasseUm();
    ClasseUmDentroDaClasseUm obj4 = new ClasseUmDentroDaClasseUm();
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        
    }
}
