import Proxy.IVanzareBilet;
import Proxy.ProxyVanzareBilet;
import Proxy.Spectator;
import Proxy.VanzareBilet;

public class Main {
    public static void main(String[] args) {
        IVanzareBilet vanzareBilet = new VanzareBilet();
        IVanzareBilet proxyVanzareBilet = new ProxyVanzareBilet((VanzareBilet) vanzareBilet);

        Spectator spectator1 = new Spectator("Dan Popescu", 16);
        Spectator spectator2 = new Spectator("Maria Stan", 11);

        proxyVanzareBilet.vindeBilet(spectator1);
        proxyVanzareBilet.vindeBilet(spectator2);
    }
}
