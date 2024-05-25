public abstract class PersonalSpital {
    private String nume;
    private ETipPersonal ETipPersonal;

    public PersonalSpital(String nume, ETipPersonal ETipPersonal) {
        this.nume = nume;
        this.ETipPersonal = ETipPersonal;
    }

    @Override
    public String toString() {
        return String.format("Nume: %s\n" +
                "Tip personal: %s", nume, ETipPersonal);
    }
}
