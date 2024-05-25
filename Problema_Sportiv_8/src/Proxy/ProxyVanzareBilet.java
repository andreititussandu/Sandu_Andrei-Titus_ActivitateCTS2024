package Proxy;

public class ProxyVanzareBilet implements IVanzareBilet {
    private VanzareBilet vanzareBilet;

    public ProxyVanzareBilet(VanzareBilet vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vindeBilet(Spectator spectator) {
        if (spectator.getVarsta() >= 14) {
            vanzareBilet.vindeBilet(spectator);
        } else {
            System.out.println("Clientul " + spectator.getNume() +
                    " nu are varsta minima de 14 ani pentru a cumpara un bilet.");
        }
    }
}
