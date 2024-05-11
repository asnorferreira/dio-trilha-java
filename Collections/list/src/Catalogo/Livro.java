package Catalogo;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String t, String a, int p) {
        this.titulo = t;
        this.autor = a;
        this.anoPublicacao = p;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
