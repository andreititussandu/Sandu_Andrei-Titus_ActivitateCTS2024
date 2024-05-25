package Adapter;

public class Rezervare {
    private String nume;
    private String loc;
    private int pret;

    public Rezervare(String nume, String loc, int pret) {
        this.nume = nume;
        this.loc = loc;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
