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

    public void setIntensity(int intensidade) {
        this.intensidade = intensidade;
        System.out.println(local + ": Intensidade da luz ajustada para " + intensidade + "%");
    }

    boolean isLigada() {
        return ligada;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public String getLocal() {
        return local;
    }
}
