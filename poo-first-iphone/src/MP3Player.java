public class MP3Player implements ReprodutorMusical {
    private String musicPlayer;
    private String currentSong;

    public MP3Player(String musicPlayer, String currentSong) {
        this.musicPlayer = musicPlayer;
        this.currentSong = currentSong;
    }

    @Override
    public String getMusicPlayer() {
        return musicPlayer;
    }

    @Override
    public void setMusicPlayer(String musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String getCurrentSong() {
        return currentSong;
    }

    @Override
    public void setCurrentSong(String currentSong) {
        this.currentSong = currentSong;
    }

    @Override
    public void tocar() {
        if (currentSong != null) {
            System.out.println("Reproduzindo [" + this.musicPlayer + "]: " + currentSong);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        if (currentSong != null) {
            System.out.println("Pausando [" + this.musicPlayer + "]: " + currentSong);
        } else {
            System.out.println("Nenhuma música em reprodução.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.currentSong = musica;
        System.out.println("Música selecionada [" + this.musicPlayer + "]: " + currentSong);
    }

    public void info() {
        System.out.println("Informações do MP3Player:");
        System.out.println("Reprodutor: " + musicPlayer);
        System.out.println("Música atual: " + (currentSong != null ? currentSong : "Nenhuma música selecionada"));
    }
}