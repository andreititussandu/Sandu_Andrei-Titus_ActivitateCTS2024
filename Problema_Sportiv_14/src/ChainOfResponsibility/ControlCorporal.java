package ChainOfResponsibility;

public class ControlCorporal extends AHandler {

    @Override
    void executaPas(Spectator spectator) {
        System.out.println(spectator.getNume() + " a trecut de controlul corporal");
        if (this.getNextHandler() != null) {
            getNextHandler().executaPas(spectator);
        }
    }
}

