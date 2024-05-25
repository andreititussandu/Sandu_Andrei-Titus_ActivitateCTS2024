import ChainOfResponsibility.*;

public class Main {
    public static void main(String[] args) {
        AsezareLaCoada asezareLaCoada = new AsezareLaCoada();
        PrezentareBilet prezentareBilet = new PrezentareBilet();
        ControlCorporal controlCorporal = new ControlCorporal();
        IntrareInStadion intrareInStadion = new IntrareInStadion();

        asezareLaCoada.setNextHandler(prezentareBilet);
        prezentareBilet.setNextHandler(controlCorporal);
        controlCorporal.setNextHandler(intrareInStadion);

        Spectator spectator = new Spectator("Andrei Sandu", "A05");
        asezareLaCoada.executaPas(spectator);
    }
}