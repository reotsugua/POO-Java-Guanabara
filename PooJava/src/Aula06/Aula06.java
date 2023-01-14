package Aula06;

public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();

        c.play();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
}