package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements Cloneable {
    private List<Solutie> solutii;

    public Reteta() {
        this.solutii = new ArrayList<>();
    }

    public void adaugaSolutie(String denumire, int cantitate) {
        solutii.add(new Solutie(denumire, cantitate));
    }

    public List<Solutie> getSolutii() {
        return solutii;
    }

    @Override
    public Reteta clone() {
        Reteta retetaNoua = new Reteta();
        for (Solutie solutie : this.solutii) {
            retetaNoua.solutii.add(new Solutie(solutie.getDenumire(), solutie.getCantitate()));
        }
        return retetaNoua;
    }
}
