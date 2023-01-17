package Aula10;

public class Aluno extends Pessoa{


    //Atributos
    private int mat;
    private String curso;

    //Métodos Públicos
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada");
    }

    //Métodos Especiais


    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
