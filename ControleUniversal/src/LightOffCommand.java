public class LightOffCommand implements Command {

    private Light luz;

    public LightOffCommand(Light luz) {
        this.luz = luz;
    }

    public void execute() {
        luz.off();
    }

    public String store() {
        return "LIGHT_OFF";
    }
}
