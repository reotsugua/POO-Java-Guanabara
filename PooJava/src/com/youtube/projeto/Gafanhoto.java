package com.youtube.projeto;

public final class Gafanhoto extends Pessoa{
    //Atributos
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.setTotAssistido(0);
    }

    //Métodos Públicos
    public void viuMaisum(){}

    @Override
    protected void ganharExp() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
