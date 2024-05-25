package Observer;

public interface IManager {
    void adaugaAbonat(IObserver observer);
    void stergeAbonat(IObserver observer);
    void trimiteNotificare(String mesaj);
}
