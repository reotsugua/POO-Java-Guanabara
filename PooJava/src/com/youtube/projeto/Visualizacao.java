package com.youtube.projeto;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.getEspectador()
                .setTotAssistido(this.getEspectador().getTotAssistido()+1);
        this.getFilme()
                .setViews(this.getFilme().getViews()+1);
    }

    public void avaliar(){
        this.getFilme().setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.getFilme().setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 10;
        }
        this.getFilme().setAvaliacao(tot);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "\nespectador=" + espectador +
                ", \nfilme=" + filme +
                '}';
    }
}
