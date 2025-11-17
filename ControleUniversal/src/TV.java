public class TV {

    private String local;
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 10;

    public TV(String local) {
        this.local = local;
    }

    public void on() {
        ligada = true;
        System.out.println(local + ": TV ligada.");
    }

    public void off() {
        ligada = false;
        System.out.println(local + ": TV desligada.");
    }

    public void setChannel(int canal) {
        this.canal = canal;
        System.out.println(local + ": TV mudando para o canal " + canal);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(local + ": TV ajustando volume para " + volume);
    }

    // getters para serem usados por comandos durante o store()
    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public String getLocal() {
        return local;
    }
}
