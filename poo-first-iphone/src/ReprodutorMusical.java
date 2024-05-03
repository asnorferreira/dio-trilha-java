public interface ReprodutorMusical {
    public void setMusicPlayer(String musicPlayer);
    public void setCurrentSong(String currentSong);

    public String getMusicPlayer();
    public String getCurrentSong();

    public void tocar();
    public void pausar();
    public void selecionarMusica(String musica);
}
