package Proxy;

public class Spectator
{
    private String nume;
    private int varsta;

    public Spectator(String nume, int varsta) {
        this.nume=nume;
        this.varsta=varsta;
    }

    @Override
    public String toString() {
        return "Client [nume=" + nume + ", varsta=" + varsta + "]";
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }


}

