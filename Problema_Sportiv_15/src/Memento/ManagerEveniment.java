package Memento;

import java.util.ArrayList;

public class ManagerEveniment {
    private ArrayList<VersiuneEveniment> listaVersiuni = new ArrayList();

    public void adaugaVersiune(VersiuneEveniment versiuneEveniment){
        this.listaVersiuni.add(versiuneEveniment);
    }

    public VersiuneEveniment recuperareVersiune(int i){
        return listaVersiuni.get(i);
    }
}
