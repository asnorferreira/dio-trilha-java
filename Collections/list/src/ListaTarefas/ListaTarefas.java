package ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefas> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefas> list = new ArrayList<Tarefas>();
        if (!list.isEmpty()) {
            for (Tarefas t : list) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    list.add(t);
                }
            }
            list.removeAll(list);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public void main(String[] args) {
        ListaTarefas l = new ListaTarefas();

        l.adicionarTarefa("Comprar leite");
        l.adicionarTarefa("Estudar para o exame");
        l.adicionarTarefa("Fazer exercícios");

        System.out.println("Você tem " + l.obterNumeroTotalTarefas() + " tarefas na lista:");
        
        l.obterDescricoesTarefas();

        l.removerTarefa("Trabalhar");

        System.out.println("Agora você tem " + l.obterNumeroTotalTarefas() + " tarefas na lista:");

    }
}
