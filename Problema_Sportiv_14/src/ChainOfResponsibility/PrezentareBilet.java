package ChainOfResponsibility;

public class PrezentareBilet extends AHandler {

    @Override
    void executaPas(Spectator spectator) {
        System.out.println(spectator.getNume() + " a prezentat biletul");
        if (this.getNextHandler() != null) {
            getNextHandler().executaPas(spectator);
        }
    }
}
