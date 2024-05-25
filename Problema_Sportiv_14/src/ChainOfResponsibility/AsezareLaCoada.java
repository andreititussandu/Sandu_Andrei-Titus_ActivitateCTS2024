package ChainOfResponsibility;

public class AsezareLaCoada extends AHandler {

    @Override
    public void executaPas(Spectator spectator) {
        System.out.println(spectator.getNume() + " s-a asezat la coada");
        if (this.getNextHandler() != null) {
            getNextHandler().executaPas(spectator);
        }
    }
}
