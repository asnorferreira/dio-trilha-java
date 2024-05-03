public class Ligacao implements AparelhoTelefonico {
    private String numeroTelefone;
    private boolean chamadaAtiva;

    public Ligacao(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        this.chamadaAtiva = false;
    }

    @Override
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    @Override
    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public boolean getChamadaAtiva() {
        return chamadaAtiva;
    }

    @Override
    public void setChamadaAtiva(boolean chamadaAtiva) {
        this.chamadaAtiva = chamadaAtiva;
    }

    @Override
    public void ligar(String numero) {
        setNumeroTelefone(numero);
        setChamadaAtiva(true);
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        if (chamadaAtiva) {
            System.out.println("Atendendo chamada de " + numeroTelefone);
        } else {
            System.out.println("Nenhuma chamada ativa.");
        }
    }

    public void info(){
        System.out.println("Informações da ligação:");
        System.out.println("Número: " + numeroTelefone);
        System.out.println("Chamada ativa: " + chamadaAtiva);
    }
}
