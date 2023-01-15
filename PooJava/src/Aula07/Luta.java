package Aula07;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiado(null);
        }
    }
    public void lutar(){
        if(this.getAprovada()){
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("====== RESULTADO DA LUTA ======");
            switch (vencedor){
            case 0: //Empate
                System.out.println("A luta empatou!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                break;
            case 1: //Ganhou Desafiado
                System.out.println(desafiado.getNome()+" ganhou!!!");
                desafiado.ganharLuta();
                desafiante.perderLuta();
                desafiado.status();
                desafiante.status();
                break;
            case 2: //Ganhou Desafiante
                System.out.println(desafiante.getNome()+" ganhou!!!");
                desafiante.ganharLuta();
                desafiado.perderLuta();
                desafiado.status();
                desafiante.status();

            }
            System.out.println("===============================");
        } else {
            System.out.println("Luta não pode acontecer");
        }

    }

    // Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
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
