public interface NavegadorInternet {
    public void setUrlAtual(String urlAtual);
    public void setNumAbas(int numAbas);

    public String getUrlAtual();
    public int getNumAbas();

    public void exibirPag(String url);
    public void addNovaAba();
    public void atualizarPag();
}
