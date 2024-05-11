package ListaTarefas;

public class Tarefas {
    private String descricao;

    public Tarefas(String d) {
        this.descricao = d;
    }
    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return descricao;
    } 

}
