package Proxy;

public class VanzareBilet implements IVanzareBilet {
    @Override
    public void vindeBilet(Spectator spectator) {
        System.out.println("Bilet vandut catre " + spectator.getNume());
    }
}

