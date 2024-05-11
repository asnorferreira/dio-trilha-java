package Catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> book;

    public CatalogoLivros() {
        this.book = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.book.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> list = new ArrayList<>();
        if (!book.isEmpty()) {
            for (Livro l : book) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    list.add(l);
                }
            }
            return list;
        } else {
            throw new RuntimeException("Lista Vazia");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoI, int anoF) {
        List<Livro> list = new ArrayList<>();
        if (!book.isEmpty()) {
            for (Livro l : book) {
                if (l.getAnoPublicacao() >= anoI && l.getAnoPublicacao() <= anoF) {
                    list.add(l);
                }
            }
            return list;
        } else {
            throw new RuntimeException("Lista Vazia");
        }
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> list = new ArrayList<>();
        if (!book.isEmpty()) {
            for (Livro l : book) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    list.add(l);
                    break;
                }
            }
            return list;
        } else {
            throw new RuntimeException("Lista Vazia");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros c = new CatalogoLivros();
        c.adicionarLivro("O Senhor dos Anéis", "Tolkien", 1954);
        c.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        c.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        c.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(c.pesquisarPorAutor("Robert C. Martin"));
        System.out.println(c.pesquisarPorIntervaloAnos(2000, 2022));
        System.out.println(c.pesquisarPorTitulo("Java Guia do Programador"));
        System.out.println(c.pesquisarPorTitulo("exit"));

    }
}
