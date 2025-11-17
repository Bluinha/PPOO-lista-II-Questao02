public class StereoOnCommand implements Command {

    private Stereo som;

    public StereoOnCommand(Stereo som) {
        this.som = som;
    }

    public void execute() {
        som.on();
    }

    public String store() {
        return "STEREO_ON";
    }
}
