public class Client {
    private static Client instance;
    private String nume;
    private String nrTelefon;

    private Client(String nume, String nrTelefon) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
    }

    public static synchronized Client getInstance(String nume, String nrTelefon) {
        if (instance == null) {
            instance = new Client(nume, nrTelefon);
        }
        return instance;
    }
}
