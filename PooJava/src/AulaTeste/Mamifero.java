package AulaTeste;

public class Mamifero extends Animal{
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som");
    }
}
