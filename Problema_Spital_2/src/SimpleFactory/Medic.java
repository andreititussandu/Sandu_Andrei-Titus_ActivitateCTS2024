package SimpleFactory;

public class Medic extends PersonalSpital {
    public Medic(String nume) {
        super(nume, SimpleFactory.ETipPersonal.Medic);
    }
}
