package ChainOfResponsibility;

public class IntrareInStadion extends AHandler {

    @Override
    void executaPas(Spectator spectator) {
        System.out.println(spectator.getNume() + " a intrat in stadion");
    }
}

