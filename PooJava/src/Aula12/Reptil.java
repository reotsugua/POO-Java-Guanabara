package Aula12;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comando vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Réptil");
    }
}
