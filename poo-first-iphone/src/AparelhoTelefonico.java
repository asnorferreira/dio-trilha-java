public interface AparelhoTelefonico {
    public void setNumeroTelefone(String numeroTelefone);
    public void setChamadaAtiva(boolean chamadaAtiva);

    public String getNumeroTelefone();
    public boolean getChamadaAtiva();

    public void ligar(String numero);
    public void atender();
}
