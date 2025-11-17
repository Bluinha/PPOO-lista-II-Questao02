public class TVSetChannelCommand implements Command {

    private TV tv;
    private int canal;

    public TVSetChannelCommand(TV tv, int canal) {
        this.tv = tv;
        this.canal = canal;
    }

    public void execute() {
        tv.setChannel(canal);
    }

    public String store() {
        return "TV_CHANNEL;" + canal;
    }
}
