package Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa(String d) {
        this.descricao = d;
        this.concluido = false;
    }

    public String getDescricao() {
        return descricao;
    }
    public boolean isConcluido() {
        return concluido;
    }
    public void setConcluido(boolean c) {
        this.concluido = c;
    }

    public void setDescricao(String d) {
        this.descricao = d;
    }

    @Override
    public String toString() {
        return "Tarefa{"+
        "descricao='" + descricao + '\'' +
        ", concluido=" + concluido +
        '}';
    }
}
