package Aula10;

public class Aluno extends Pessoa{
    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    //Atributos
    private int matr;
    private String curso;

    //Métodos Públicos
    public void cancelarMatr(){}

    //Métodos Especiais


    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
