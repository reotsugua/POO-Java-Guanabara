package Aula10;

public class Funcionario extends Pessoa{


    //Atributos
    private String setor;
    private boolean trabalhando;

    //Construtores
    //Métodos Públicos
    public void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }

    //Métodos Especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
