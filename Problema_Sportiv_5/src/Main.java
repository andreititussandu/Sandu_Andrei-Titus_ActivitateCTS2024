import Adapter.AdapterRezervare;
import Adapter.Rezervare;
import Adapter.iRezervareEBilet;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Andrei Sandu", "C08", 50);

        iRezervareEBilet rezervareEBilet = new AdapterRezervare(rezervare);
        rezervareEBilet.efectueazaRezervareEBilet(rezervare);
    }
}