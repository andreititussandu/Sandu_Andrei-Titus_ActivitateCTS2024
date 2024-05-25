package ChainOfResponsibility;

public class Spectator {
    private String nume;
    private String loc;

    public Spectator(String nume, String loc) {
        this.nume = nume;
        this.loc = loc;
    }

    public String getNume() {
        return nume;
    }

    public String getLoc() {
        return loc;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
