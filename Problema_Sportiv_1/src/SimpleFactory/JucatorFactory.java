package SimpleFactory;

import SimpleFactory.Atacant;
import SimpleFactory.ETipJucator;
import SimpleFactory.Fundas;

public class JucatorFactory {
    public static Jucator creareJucator(ETipJucator tip) throws Exception {
        switch (tip) {
            case PORTAR:
                return new Portar();
            case FUNDAS:
                return new Fundas();
            case ATACANT:
                return new Atacant();
            default:
                throw new Exception("Nu este un post valid");
        }
    }
}

