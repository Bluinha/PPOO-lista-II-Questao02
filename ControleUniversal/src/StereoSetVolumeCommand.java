public class StereoSetVolumeCommand implements Command {

    private Stereo som;
    private int volume;

    public StereoSetVolumeCommand(Stereo som, int volume) {
        this.som = som;
        this.volume = volume;
    }

    public void execute() {
        som.setVolume(volume);
    }

    public String store() {
        return "STEREO_VOLUME;" + volume;
    }
}
