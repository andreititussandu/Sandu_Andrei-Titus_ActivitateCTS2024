public abstract class PersonalSpital {
    private String nume;
    private TipPersonal tipPersonal;

    public PersonalSpital(String nume, TipPersonal tipPersonal) {
        this.nume = nume;
        this.tipPersonal = tipPersonal;
    }

    @Override
    public String toString() {
        return String.format("Nume: %s\n" +
                "Tip personal: %s", nume, tipPersonal);
    }
}
