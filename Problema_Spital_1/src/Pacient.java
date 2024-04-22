public class Pacient {
    private String nume;
    private String prenume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public Pacient(String nume, boolean patRabatabil, boolean micDejunInclus, boolean papuciCamera, boolean halatInterior) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    @Override
    public String toString() {
        return String.format("Pacient: %s \n" +
                        "Facilități extra:\n" +
                        "  - Pat rabatabil: %s\n" +
                        "  - Mic dejun inclus: %s\n" +
                        "  - Papuci de camera: %s\n" +
                        "  - Halat pentru interior: %s",
                nume,
                patRabatabil ? "Da" : "Nu",
                micDejunInclus ? "Da" : "Nu",
                papuciCamera ? "Da" : "Nu",
                halatInterior ? "Da" : "Nu");
    }

}
