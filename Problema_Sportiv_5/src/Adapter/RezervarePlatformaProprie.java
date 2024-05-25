package Adapter;

import Adapter.Rezervare;
import Adapter.iRezervarePlatformaProprie;

class RezervarePlatformaProprie implements iRezervarePlatformaProprie {
    private Rezervare rezervare;

    public RezervarePlatformaProprie(String nume, String loc, int pret) {
        this.rezervare = new Rezervare(nume, loc, pret);
    }

    public RezervarePlatformaProprie(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void efectueazaRezervareProprie() {
        System.out.println("Rezervare efectuata pentru " + rezervare.getNume() + ", loc: "
                + rezervare.getLoc() + ", pret: " + rezervare.getPret());
    }
}
