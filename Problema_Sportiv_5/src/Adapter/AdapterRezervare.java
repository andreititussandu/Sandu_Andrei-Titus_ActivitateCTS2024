package Adapter;

import Adapter.Rezervare;
import Adapter.RezervarePlatformaProprie;
import Adapter.iRezervareEBilet;

public class AdapterRezervare extends RezervarePlatformaProprie implements iRezervareEBilet {
    public AdapterRezervare(String nume, String loc, int pret) {
        super(nume, loc, pret);
    }

    public AdapterRezervare(Rezervare rezervare) {
        super(rezervare);
    }

    @Override
    public void efectueazaRezervareEBilet(Rezervare rezervare) {
        System.out.println("Rezervare EBilet efectuata pentru " + rezervare.getNume() +
                ", loc: " + rezervare.getLoc() + ", pret: " + rezervare.getPret());
    }
}
