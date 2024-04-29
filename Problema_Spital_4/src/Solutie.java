public class Solutie {
    private String denumire;
    private int cantitate;

    public Solutie(String denumire, int cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}
