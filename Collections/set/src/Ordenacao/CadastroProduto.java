package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtos;

    public CadastroProduto() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int qtd ) {
        this.produtos.add(new Produto(cod, nome, preco, qtd));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produto = new TreeSet<>(produtos);
        if(!produto.isEmpty()){
            return produto;
        } else {
            throw new RuntimeException("Conjunto vazio!");
        }
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produto = new TreeSet<>(new ComparatorPorPreco());
        produto.addAll(produtos);
        if(!produto.isEmpty()){
            return produto;
        } else {
            throw new RuntimeException("Conjunto vazio!");
        }
    }

    public static void main(String[] args) {
        CadastroProduto c = new CadastroProduto(); 
    
        c.adicionarProduto(1L, "Smartphone", 1000d, 10);
        c.adicionarProduto(2L, "Notebook", 1500d, 5);
        c.adicionarProduto(1L, "Mouse", 30d, 20);
        c.adicionarProduto(4L, "Teclado", 50d, 15);
    
        System.out.println(c.produtos);
        System.out.println("--------------------------------");
        System.out.println(c.exibirProdutosPorNome());
        System.out.println("--------------------------------");
        System.out.println(c.exibirProdutosPorPreco());
    }
}
