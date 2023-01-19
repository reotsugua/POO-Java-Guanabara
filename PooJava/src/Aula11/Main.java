package Aula11;

public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Juvenas");
        v1.setIdade(22);
        System.out.println(v1);

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12);
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setRegistroProfissional(87654);
        t1.setNome("Roberto");
        t1.praticar();
        t1.pagarMensalidade();



    }
}
