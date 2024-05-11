package Compras;

public class Item {
    private String nome;
    private double preco;
    private int qtd;

    public Item(String n, double p, int q){
        this.nome = n;
        this.preco = p;
        this.qtd = q;
    }
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public int getQtd(){
        return this.qtd;
    }

    @Override
    public String toString() {
        return "item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtd=" + qtd +
                '}';
    }
}
