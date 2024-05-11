package Compras;

import java.util.ArrayList;
import java.util.List;

// adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
// removerItem(String nome): Remove um item do carrinho com base no seu nome.
// calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
// exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> item = new ArrayList<Item>();
        if (!itens.isEmpty()) {
            for (Item i : itens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    item.add(i);
                }
            }
            itens.removeAll(item);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itens.isEmpty()){
            for (Item item: itens){
                double valorItem = item.getPreco() * item.getQtd();
                valorTotal += valorItem;
            }
            return valorTotal;
        }
        else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void exibirItens(){
        if (!itens.isEmpty()) {
            for (Item i : itens) {
                System.out.println(i);
            }
        } else {
            System.out.println("Lista vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itens +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        c.adicionarItem("Lápis", 2d, 3);
        c.adicionarItem("Lápis", 2d, 3);
        c.adicionarItem("Caderno", 35d, 1);
        c.adicionarItem("Borracha", 2d, 2);
        System.out.println("-------------------------------------------");
        c.exibirItens();

        c.removerItem("Lápis");
        System.out.println("-------------------------------------------");
        c.exibirItens();
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("O valor total da compra é: R$" + c.calcularValorTotal());
    }
}
