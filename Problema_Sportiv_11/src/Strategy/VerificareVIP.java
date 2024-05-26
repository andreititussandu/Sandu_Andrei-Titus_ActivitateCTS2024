package Strategy;

public class VerificareVIP implements IVerificare{
    @Override
    public void verifica() {
        System.out.println("Verificare bilet pentru spectator VIP.");
    }
}
