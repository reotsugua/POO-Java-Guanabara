package Aula07;

public class Luta {
    //Atributos
    private String desafiado;
    private String desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Públicos
    public void marcarLuta() {}
    public void lutar(){}

    // Métodos Especiais
    public String getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }

    public String getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
