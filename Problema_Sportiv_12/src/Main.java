import Observer.Abonat;
import Observer.NotificareFotbal;
import Observer.NotificareHandbal;
import Observer.NotificareVolei;

public class Main {
    public static void main(String[] args) {
        NotificareFotbal notificareFotbal = new NotificareFotbal();
        NotificareHandbal notificareHandbal = new NotificareHandbal();
        NotificareVolei notificareVolei = new NotificareVolei();

        notificareFotbal.adaugaAbonat(new Abonat("Ioana"));
        notificareFotbal.adaugaAbonat(new Abonat("Marian"));
        notificareHandbal.adaugaAbonat(new Abonat("George"));
        notificareVolei.adaugaAbonat(new Abonat("Ana"));

        notificareFotbal.programareMeciFotbal();
        notificareHandbal.programareMeciHandbal();
        notificareVolei.programareMeciVolei();
    }
}