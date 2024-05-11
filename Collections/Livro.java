package Collections;

import java.util.Comparator;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String t, String a, int n) {
        this.titulo = t;
        this.autor = a;
        this.ano = n;
    }
    // Ordenar livros por ano
    public int compareTo(Livro l){
        return titulo.compareTo(l.titulo);
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String t) {
        this.titulo = t;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String a) {
        this.autor = a;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int n) {
        this.ano = n;
    }


}

class CompararAutor implements Comparator<Livro>{
    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}

class CompararAno implements Comparator<Livro>{
    @Override
    public int compare(Livro l1, Livro l2) {
        if (l1.getAno() < l2.getAno()){
            return -1;
        }
        if (l1.getAno() > l2.getAno()){
            return 1;
        }
        else {
            return 0;
        }
    }
}

class CompararAnoAutorTitulo implements Comparator<Livro>{
    @Override
    public int compare(Livro l1, Livro l2) {
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if (ano!= 0){
            return ano;
        }
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if (autor!= 0){
            return autor;
        }
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}