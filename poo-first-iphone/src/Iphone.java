public class Iphone {
    private String modelo;
    private int anoLancamento;
    private boolean ligado;
    private MP3Player player;
    private Google site;
    private Ligacao call;

    public Iphone(String m, int a) {
        this.modelo = m;
        this.anoLancamento = a;
        this.ligado = false;
        this.player = null;
        this.site = null;
        this.call = null;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void onOff() {
        ligado = !ligado;
        System.out.println("Aparelho " + (ligado ? "ligado." : "desligado."));
    }

    public void conectMp3(MP3Player player) {
        this.player = player;
        System.out.println("MP3Player conectado ao iPhone: " + modelo);
    }

    public void reproduzirMsc(String musica) {
        if (player != null && ligado) {
            player.selecionarMusica(musica);
            player.tocar();
        } else {
            System.out.println("Nenhum MP3Player conectado ou iPhone desligado.");
        }
    }

    public void acessarSite(Google site, String url) {
        if (ligado) {
            this.site = site;
            site.exibirPag(url);
        } else {
            System.out.println("iPhone desligado. Sem posibilidade de acesso ao webSite.");
        }
    }

    public void ligar(Ligacao call, String numeroTelefone, boolean chamadaAtiva){
        if (ligado) {
            this.call = call;
            call.ligar(numeroTelefone);
            call.setChamadaAtiva(chamadaAtiva);
        } else {
            System.out.println("iPhone desligado. Sem posibilidade de ligação.");
        }
    }

    public void info() {
        System.out.println("Informações do iPhone:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Estado: " + (ligado ? "ligado" : "desligado"));
        if (player != null) {
            System.out.println("MP3Player conectado: " + player.getMusicPlayer());
            System.out.println("Música atual: " + player.getCurrentSong());
        } else {
            System.out.println("Nenhum MP3Player conectado.");
        }
        if (site != null) {
            System.out.println("Site em aberto: " + site.getUrlAtual());
        } else {
            System.out.println("Nenhum site em aberto.");
        }
        if (call != null){
            System.out.println("Ligação realizada para: " + call.getNumeroTelefone());
        } else {
            System.out.println("Nenhuma ligação realizada.");
        }
    }
}