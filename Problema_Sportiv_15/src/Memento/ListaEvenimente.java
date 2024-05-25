package Memento;

public class ListaEvenimente {
    private InfoEveniment infoEveniment;

    public ListaEvenimente(InfoEveniment infoEveniment) {
        super();
        this.infoEveniment = infoEveniment;
    }

    public void refacereVersiuneListaEvenimente(VersiuneEveniment versiuneEveniment){
        this.infoEveniment = versiuneEveniment.getSavedInfo();
    }

    public VersiuneEveniment salvare(){
        System.out.println("Salvare versiune eveniment");
        return new VersiuneEveniment(infoEveniment);
    }

    @Override
    public String toString() {
        return "Informatii Eveniment = " + infoEveniment;
    }
}
