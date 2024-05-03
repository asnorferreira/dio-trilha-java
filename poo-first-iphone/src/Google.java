public class Google implements NavegadorInternet {
    private String urlAtual;
    private int numAbas;

    public Google(String urlAtual, int numAbas) {
        this.urlAtual = urlAtual;
        this.numAbas = numAbas;
    }

    @Override
    public String getUrlAtual() {
        return urlAtual;
    }

    @Override
    public void setUrlAtual(String urlAtual) {
        this.urlAtual = urlAtual;
    }

    @Override
    public int getNumAbas() {
        return numAbas;
    }
    @Override
    public void setNumAbas(int numAbas) {
        this.numAbas = numAbas;
    }

    @Override
    public void exibirPag(String url) {
        System.out.println("Exibindo: " + url);
        setUrlAtual(url);
    }
    @Override
    public void addNovaAba() {
        numAbas++;
        System.out.println("Total de abas: " + numAbas);
    }
    @Override
    public void atualizarPag() {
        System.out.println("Atualizando página: " + urlAtual);
    }

    public void info(){
        System.out.println("Informações do Navegador:");
        System.out.println("URL atual: " + urlAtual);
        System.out.println("Número de abas: " + numAbas);
    }
}
