package Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long cod;
    private double preco;
    private int qtd;

    public Produto(long c, String n, double p, int q) {
        this.nome = n;
        this.cod = c;
        this.preco = p;
        this.qtd = q;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setCod(long c) {
        this.cod = c;
    }

    public void setPreco(double p) {
        this.preco = p;
    }

    public void setQtd(int q) {
        this.qtd = q;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Produto produto))
            return false;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCódigo: " + cod + "\nPreço: " + preco + "\nQuantidade: " + qtd;
    }
}

class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
      return Double.compare(p1.getPreco(), p2.getPreco());
    }
}