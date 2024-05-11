package Collections.map.src.Ordenacao;

import java.util.Comparator;
import java.util.Map;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String t, String a, double p) {
        this.titulo = t;
        this.autor = a;
        this.preco = p;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + '}';
    }
}

class ComparatorPreco implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return Double.compare(o1.getValue().getPreco(), o2.getValue().getPreco());
    }
}

class ComparatorTitulo implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getTitulo().compareTo(o2.getValue().getTitulo());
    }
}

class ComparatorAutor implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getAutor().compareTo(o2.getValue().getAutor());
    }
}