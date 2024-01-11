package br.com.condominio;

public class Teste {
    //Piscina e apartamento sao visiveis somento no condominio
    
    public static void main(String[] args) {
        Piscina piscina = new Piscina();
        Apartamento Apartamento = new Apartamento();
        System.out.println(piscina.getBoia());
        piscina.setBoia("Nova boia");
    }
}
