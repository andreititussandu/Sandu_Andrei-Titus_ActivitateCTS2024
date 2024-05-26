import Strategy.Spectator;
import Strategy.VerificarePeluza;
import Strategy.VerificareVIP;

public class Main {
    public static void main(String[] args) {
        Spectator spectator1 = new Spectator("Andrei","B01", new VerificareVIP());
        Spectator spectator2 = new Spectator("Bogdan","F02",new VerificarePeluza());
        spectator1.verificareSpectator();
        spectator2.verificareSpectator();
    }
}
