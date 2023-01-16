package Aula10;

public class Funcionario extends Pessoa{
    public Funcionario(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    //Atributos
    private String setor;
    private boolean trabalhando;

    //Construtores
    //Métodos Públicos
    public void mudarTrabalho(){}

    //Métodos Especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
