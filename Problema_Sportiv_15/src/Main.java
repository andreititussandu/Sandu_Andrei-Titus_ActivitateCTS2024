import Memento.ListaEvenimente;
import Memento.InfoEveniment;
import Memento.ManagerEveniment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ManagerEveniment managerEvenimente = new ManagerEveniment();

        List<String> echipe1 = new ArrayList<>();
        echipe1.add("Steaua");
        echipe1.add("Dinamo");

        InfoEveniment infoEveniment1 = new InfoEveniment("12.02.2024",
                echipe1, 40000, 3000, 200);
        ListaEvenimente listaEvenimente = new ListaEvenimente(infoEveniment1);

        managerEvenimente.adaugaVersiune(listaEvenimente.salvare());
        System.out.println(listaEvenimente);

        InfoEveniment infoEveniment2 = new InfoEveniment("20.04.2024",
                echipe1, 34000, 2300, 180);

        listaEvenimente = new ListaEvenimente(infoEveniment2);
        managerEvenimente.adaugaVersiune(listaEvenimente.salvare());
        System.out.println(listaEvenimente);

        listaEvenimente.refacereVersiuneListaEvenimente(
                managerEvenimente.recuperareVersiune(0));
        System.out.println(listaEvenimente);
    }
}
