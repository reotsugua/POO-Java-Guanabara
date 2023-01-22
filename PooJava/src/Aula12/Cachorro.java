package Aula12;

public class Cachorro extends Mamifero{
    public void enterrarOsso(){}
    public void abanarRabo(){}

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Latindo");
    }
}
