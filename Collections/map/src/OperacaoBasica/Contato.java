package OperacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class Contato {
    private Map<String, Integer> agendaMap;

    public Contato() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionar(String nome, Integer telefone) {
        this.agendaMap.put(nome, telefone);
    }

    public void remover(String nome) {
        if (!agendaMap.isEmpty()) {
            agendaMap.remove(nome);
        } else {
            System.out.println("Agenda vazia!");
        }
    }

    public void exibirContatos() {
        if (!agendaMap.isEmpty()) {
            System.out.println(agendaMap);
        } else {
            System.out.println("Agenda vazia!");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer num = null;
        if (!agendaMap.isEmpty()) {
            num = agendaMap.get(nome);
            if (num == null) {
                System.out.println("Contato não encontrado!");
            }
        } else {
            System.out.println("Agenda vazia!");
        }
        return num;
    }

    public static void main(String[] args) {
        Contato a = new Contato();

        a.adicionar("Camila", 123456);
        a.adicionar("João", 5665);
        a.adicionar("Carlos", 1111111);
        a.adicionar("Ana", 654987);
        a.adicionar("Maria", 1111111);
        a.adicionar("Camila", 44444);

        a.exibirContatos();
        System.out.println("");
        System.out.println("------------------------------------------------");
        a.remover("Maria");
        a.exibirContatos();
        System.out.println("");
        System.out.println("------------------------------------------------");
        String nomePesquisa = "João";
        Integer numeroPesquisa = a.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);
        System.out.println("");
        System.out.println("------------------------------------------------");
        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = a.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}
