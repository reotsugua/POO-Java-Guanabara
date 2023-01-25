package com.youtube.projeto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 1 de HTML4");
        /*System.out.println("Videos\n________________________");
        for ( Video count : v
             ) {
            System.out.println(count);
        }*/

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 18, "F", "creuzita");
        /*System.out.println("\nGafanhotos\n________________________");
        for ( Gafanhoto gafanhoto : g
        ) {
            System.out.println(gafanhoto);
        }*/


        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0]);

        /*vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[1]);*/
    }
}
