package Strategy;

public class Spectator {
    private String nume;
    private String loc;
    private IVerificare strategieVerificare;

    public Spectator(String nume, String loc, IVerificare strategieVerificare) {
        this.nume = nume;
        this.loc = loc;
        this.strategieVerificare = strategieVerificare;
    }

    public String getNume() {
        return nume;
    }

    public void setStrategieVerificare(IVerificare strategieVerificare) {
        this.strategieVerificare = strategieVerificare;
    }

    public void verificareSpectator() {
        strategieVerificare.verifica();
    }
}
