package Observer;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IManager{
    private List<IObserver> listaObservatori;

    public Manager() {
        super();
        this.listaObservatori = new ArrayList<>();
    }

    @Override
    public void adaugaAbonat(IObserver abonat) {
        listaObservatori.add(abonat);
    }

    @Override
    public void stergeAbonat(IObserver abonat) {
        listaObservatori.remove(abonat);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(IObserver abonat: listaObservatori)
            abonat.getMesaj(mesaj);
    }
}
