package SimpleFactory;

import SimpleFactory.ETipSupa;

public class SoupFactory {
    public static Supa creareSupa(ETipSupa tip) throws Exception {
        switch (tip) {
            case LEGUME:
                return new SupaDeLegume();
            case CIUPERCI:
                return new SupaDeCiuperci();
            case VITA:
                return new SupaDeVita();
            default:
                throw new Exception("Nu este un tip de supa valid!");
        }
    }
}

