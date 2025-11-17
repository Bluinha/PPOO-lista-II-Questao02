public class Stereo {

    private String local;
    private boolean ligado = false;
    private int volume = 10;
    private String musica = "Nenhuma";

    public Stereo(String local) {
        this.local = local;
    }

    public void on() {
        ligado = true;
        System.out.println(local + ": Som ligado.");
    }

    public void off() {
        ligado = false;
        System.out.println(local + ": Som desligado.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(local + ": Volume ajustado para " + volume);
    }

    public void playMusic(String musica) {
        this.musica = musica;
        System.out.println(local + ": Tocando música: " + musica);
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVolume() {
        return volume;
    }

    public String getMusica() {
        return musica;
    }

    public String getLocal() {
        return local;
    }
}
