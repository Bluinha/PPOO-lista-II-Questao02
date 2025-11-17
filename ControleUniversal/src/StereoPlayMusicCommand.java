public class StereoPlayMusicCommand implements Command {

    private Stereo som;
    private String musica;

    public StereoPlayMusicCommand(Stereo som, String musica) {
        this.som = som;
        this.musica = musica;
    }

    public void execute() {
        som.playMusic(musica);
    }

    public String store() {
        return "STEREO_PLAY;" + musica;
    }
}

