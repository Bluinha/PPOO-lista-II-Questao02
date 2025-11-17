public class StereoOffCommand implements Command {

    private Stereo som;

    public StereoOffCommand(Stereo som) {
        this.som = som;
    }

    public void execute() {
        som.off();
    }

    public String store() {
        return "STEREO_OFF";
    }
}
