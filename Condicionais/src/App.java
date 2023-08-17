public class App {
    public static void main(String[] args) throws Exception {
        /*
         * > maior
         * < menor que
         * >= maior igual a
         * <= menor igual a
         * == igual
         * != diferente
         * 
         * && and
         * || or 
         * ! not
         */


         String video = "wandavision";

         // operador ternario
         String categoria = video == "HunterxHunter" ? "anime" : "serie";
        /*  if(video == "Hunter x Hunter") {
            categoria = "anime";
         } else {
            categoria = "serie";
         } */
         System.out.println(categoria);
        /* String corFruta = "vermelho";

        if(corFruta == "vermelho")
            System.out.println("esta madura");
        else if(corFruta == "amarelo")
            System.out.println("esta quase madura");
        else if(corFruta == "verde")
            System.out.println("não esta boa para comer");
        else
            System.out.println("Não coma, está podre !!"); */

       /*  boolean estaChovendo = false;
        boolean temGuardachuva = false;
        int poderDeLuta = 45000;
        if(estaChovendo && temGuardachuva) { //condicao 1
            //executa tudo o que estiver aqui caso seja veradadeiro
            System.out.println("Boaa !! não está molhando !!");
        } else if(estaChovendo){ // condicao 2
            //executa caso a condição anterior for falsa e a condição do else if for verdadeira
            System.out.println("Voce pode dançar na chuva");
        } else { //condicao 3
            System.out.println("Nao esta chovendo");
        } */


    }
}
