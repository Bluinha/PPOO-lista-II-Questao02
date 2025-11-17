public class Light {

    private String local;
    private boolean ligada = false;
    private int intensidade = 100; // intensidade da luz (0–100)

    public Light(String local) {
        this.local = local;
    }

    public void on() {
        ligada = true;
        System.out.println(local + ": Luz acesa.");
    }

    public void off() {
        ligada = false;
        System.out.println(local + ": Luz apagada.");
    }

    boolean isLigada() {
        return ligada;
    }

    public String getLocal() {
        return local;
    }
}
