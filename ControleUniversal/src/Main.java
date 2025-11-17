public class Main {
    public static void main(String[] args) {

        Store store = new Store("comandos.txt");

        TV tvSala = new TV("Sala");
        Light luzQuarto = new Light("Quarto");
        Stereo somCozinha = new Stereo("Cozinha");

        RemoteControl controle = new RemoteControl(store, tvSala, luzQuarto, somCozinha);

        System.out.println("=== Executando comandos antes da pane ===");

        controle.executeCommand(new TVOnCommand(tvSala));
        controle.executeCommand(new TVSetChannelCommand(tvSala, 12));

        controle.executeCommand(new LightOnCommand(luzQuarto));
        controle.executeCommand(new LightOffCommand(luzQuarto));

        controle.executeCommand(new StereoOnCommand(somCozinha));
        controle.executeCommand(new StereoSetVolumeCommand(somCozinha, 20));
        controle.executeCommand(new StereoPlayMusicCommand(somCozinha, "Rock"));

        System.out.println("\n=== PANE ELÉTRICA ===");
        System.out.println("Dispositivos reiniciados...\n");

        tvSala = new TV("Sala");
        luzQuarto = new Light("Quarto");
        somCozinha = new Stereo("Cozinha");

        RemoteControl controleRestaurado = new RemoteControl(store, tvSala, luzQuarto, somCozinha);

        System.out.println("=== Restaurando comandos ===");
        controleRestaurado.restore();

        System.out.println("\n=== Restauração completa ===");
    }
}
