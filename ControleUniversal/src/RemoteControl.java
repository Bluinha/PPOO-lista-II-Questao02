import java.util.List;

public class RemoteControl {

    private Store store;
    private TV tvSala;
    private Light luzQuarto;
    private Stereo somCozinha;

    public RemoteControl(Store store, TV tvSala, Light luzQuarto, Stereo somCozinha) {
        this.store = store;
        this.tvSala = tvSala;
        this.luzQuarto = luzQuarto;
        this.somCozinha = somCozinha;
    }

    public void executeCommand(Command command) {
        command.execute();
        store.salvarComando(command.store());
    }

    public void restore() {
        List<String> linhas = store.carregarComandos();
        for (String l : linhas) {
            Command cmd = criarComandoAPartirDaLinha(l);
            if (cmd != null) cmd.execute();
        }
    }

    private Command criarComandoAPartirDaLinha(String linha) {
        String[] p = linha.split(";");

        switch (p[0]) {

            case "TV_ON":
                return new TVOnCommand(tvSala);

            case "TV_OFF":
                return new TVOffCommand(tvSala);

            case "TV_CHANNEL":
                return new TVSetChannelCommand(tvSala,
                        Integer.parseInt(p[1]));

            case "LIGHT_ON":
                return new LightOnCommand(luzQuarto);

            case "LIGHT_OFF":
                return new LightOffCommand(luzQuarto);

            case "STEREO_ON":
                return new StereoOnCommand(somCozinha);

            case "STEREO_OFF":
                return new StereoOffCommand(somCozinha);

            case "STEREO_VOLUME":
                return new StereoSetVolumeCommand(somCozinha,
                        Integer.parseInt(p[1]));

            case "STEREO_PLAY":
                return new StereoPlayMusicCommand(somCozinha,
                        p[1]);
        }

        return null;
    }
}
