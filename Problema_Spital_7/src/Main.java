import Memento.ETipRezultat;
import Memento.ManagerRezultate;
import Memento.Rezultat;

public class Main {
    public static void main(String[] args) throws Exception {
        Rezultat rezultat = new Rezultat("Andrei", ETipRezultat.ELECTRONIC);
        ManagerRezultate managerRezultate = new ManagerRezultate();

        System.out.println(rezultat);
        managerRezultate.adaugaVersiune(rezultat.salvareVersiune());

        rezultat.setModalitateTrimitere(ETipRezultat.FIZIC);
        System.out.println(rezultat);

        System.out.println("Versiunea recuperata: ");
        rezultat.refacereVersiune(managerRezultate.recuperareUltimaVersiune());

        System.out.println(rezultat);

    }
}