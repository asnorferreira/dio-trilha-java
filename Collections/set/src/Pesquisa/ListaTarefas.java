package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Set<Tarefa> task = new HashSet<>();
        if (!tarefas.isEmpty()) {
            for (Tarefa t : tarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    task.add(t);
                }
            }
            tarefas.removeAll(task);
        } else {
            throw new RuntimeException("Conjunto vazio!");
        }
    }

    public void exibirTarefas() {
        if (!tarefas.isEmpty()) {
            for (Tarefa t : tarefas) {
                System.out.println(t);
            }
        } else {
            throw new RuntimeException("Conjunto vazio!");
        }
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> task = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (t.isConcluido()) {
                task.add(t);
            }
        }
        return task;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> task = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (!t.isConcluido()) {
                task.add(t);
            }
        }
        return task;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
                return;
            }
        }
        System.out.println("Tarefa não encontrada!");
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(false);
                return;
            }
        }
        System.out.println("Tarefa não encontrada!");
    }

    public void limparListaTarefas() {
        tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas l = new ListaTarefas();

        l.adicionarTarefa("Estudar Java");
        l.adicionarTarefa("Fazer exercícios físicos");
        l.adicionarTarefa("Organizar a mesa de trabalho");
        l.adicionarTarefa("Ler livro");
        l.adicionarTarefa("Preparar apresentação");

        l.exibirTarefas();
        System.out.println("-------------------------------------------");
        l.removerTarefa("Fazer exercícios físicos");
        l.exibirTarefas();
        System.out.println("-------------------------------------------");

        System.out.println("Total de tarefas na lista: " + l.contarTarefas());
        System.out.println("-------------------------------------------");

        System.out.println(l.obterTarefasPendentes());
        System.out.println("2");
        l.marcarTarefaConcluida("Ler livro");
        l.marcarTarefaConcluida("Estudar Java");

        System.out.println(l.obterTarefasConcluidas());
        System.out.println("-------------------------------------------");
        System.out.println("3");
        l.marcarTarefaPendente("Estudar Java");
        l.exibirTarefas();
        System.out.println("-------------------------------------------");

        l.limparListaTarefas();
        l.exibirTarefas();
    }
}
