package Memento;

public class VersiuneEveniment {
    private InfoEveniment infoEveniment;

    public VersiuneEveniment(InfoEveniment infoEveniment) {
        super();
        this.infoEveniment = infoEveniment;
    }

    public InfoEveniment getSavedInfo() {
        return infoEveniment;
    }
}
