package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionar(String linguagem, Integer contagem) {
        contagemMap.put(linguagem, contagem);
    }

    public void remover(String palavra) {
        if (!palavra.isEmpty()) {
            contagemMap.remove(palavra);
        } else {
            System.out.println("Map vazia!");
        }
    }

    public int exibirContagemPalavras() {
        int num = 0;
        for (int c : contagemMap.values()) {
            num += c;
        }
        return num;
    }

    public String encontrarPalavra() {
        String linguagem = null;
        int num = 0;
        for (Map.Entry<String, Integer> e : contagemMap.entrySet()) {
            if (e.getValue() > num) {
                num = e.getValue();
                linguagem = e.getKey();
            }
        }
        return linguagem;
    }

    public static void main(String[] args) {
        ContagemPalavras c = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        c.adicionar("Java", 2);
        c.adicionar("Python", 8);
        c.adicionar("JavaScript", 1);
        c.adicionar("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + c.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = c.encontrarPalavra();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
