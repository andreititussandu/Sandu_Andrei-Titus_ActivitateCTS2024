package Memento;

public class Rezultat {
    private String numePacient;
    private ETipRezultat modAfisareRezultate;

    public Rezultat(String numePacient, ETipRezultat modAfisareRezultate) {
        this.numePacient = numePacient;
        this.modAfisareRezultate = modAfisareRezultate;
    }

    public Rezultat setModalitateTrimitere(ETipRezultat modAfisareRezultate) {
        this.modAfisareRezultate = modAfisareRezultate;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezultat{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", modAfisareRezultate=").append(modAfisareRezultate);
        sb.append('}');
        return sb.toString();
    }

    public void refacereVersiune(VersiuneRezultat mementoRezultat) {
        this.modAfisareRezultate = mementoRezultat.getModAfisareRezultat();
    }

    public VersiuneRezultat salvareVersiune() {
        System.out.println("Salvare stare!");
        return new VersiuneRezultat(modAfisareRezultate);
    }
}
