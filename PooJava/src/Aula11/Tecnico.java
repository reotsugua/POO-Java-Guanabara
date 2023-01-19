package Aula11;

public class Tecnico extends Aluno{

    private int registroProfissional;

    public void praticar(){
        System.out.println(this.getNome() + " está praticando");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome()+" de registro: "+this.getRegistroProfissional()+" está pagando a mensalidade");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
