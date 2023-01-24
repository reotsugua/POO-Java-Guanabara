package com.youtube.projeto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 1 de HTML4");

        for ( Video count : v
             ) {
            System.out.println(count);
        }

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 18, "F", "creuzita");

        for ( Gafanhoto gafanhoto : g
        ) {
            System.out.println(gafanhoto);
        }
    }
}
