package Memento;

import java.util.ArrayList;

public class ManagerRezultate {
    private ArrayList<VersiuneRezultat> listaVersiuni = new ArrayList<>();
    public void adaugaVersiune(VersiuneRezultat versiuneRezultat){
        this.listaVersiuni.add(versiuneRezultat);
    }

    public VersiuneRezultat recuperareUltimaVersiune() throws Exception {
        if (listaVersiuni.isEmpty()) {
            throw new Exception("Nu exista versiuni salvate!");
        }
        return listaVersiuni.remove(listaVersiuni.size() - 1);
    }

}
