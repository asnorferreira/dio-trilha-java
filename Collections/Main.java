package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        ArrayList<Livro> ls = new ArrayList<Livro>() {
            {
                add(new Livro("Java - Guia do Programador", "Perter Jandl", 2002));
                add(new Livro("Desenvolvimento Real de software", "Richard Warburton", 2021));
            }
        };
        Collections.sort(ls);
        for(Livro l: ls){
            System.out.println(l.getTitulo() + " - " +
                            l.getAutor() + " - " + 
                            l.getAno());
        }
        System.out.println("------------------------------------------------");
        Collections.sort(ls, new CompararAno());
        for(Livro l: ls){
            System.out.println(l.getAno() + " - " +
                            l.getAutor() + " - " + 
                            l.getTitulo());
        }
        System.out.println("------------------------------------------------");
        Collections.sort(ls, new CompararAutor());
        for(Livro l: ls){
            System.out.println(l.getAutor() + " - " +
                            l.getAno() + " - " + 
                            l.getTitulo());
        }
        System.out.println("------------------------------------------------");
        Collections.sort(ls, new CompararAnoAutorTitulo());
        for(Livro l: ls){
            System.out.println(l.getTitulo() + " - " +
                            l.getAno() + " - " + 
                            l.getAutor());
        }
    }
}