package Aula10;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        p3.setSalario(2500.75f);
        p3.receberAum(550.20f);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }
}
