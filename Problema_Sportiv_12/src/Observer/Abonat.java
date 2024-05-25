package Observer;

public class Abonat implements IObserver{
    private String nume;

    public Abonat(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println(nume + " a primit o notificare: " + mesaj);
    }
}
