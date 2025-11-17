public class LightOnCommand implements Command {

    private Light luz;

    public LightOnCommand(Light luz) {
        this.luz = luz;
    }

    public void execute() {
        luz.on();
    }

    public String store() {
        return "LIGHT_ON";
    }
}
