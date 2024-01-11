package br.com.condominio;

class Piscina{
    private String boia;

    // getters e setters
    public String getBoia(){
        registrarEmprestimo();
        return boia;
    }

    public void setBoia(String boia){
        //verificar se a boia ta furada
        this.boia = boia;
    }

    private void registrarEmprestimo() {

    }
}