package SimpleFactory;

public class PersonalSpitalFactory {
    public static PersonalSpital createPersonal(String nume, ETipPersonal ETipPersonal) {
        switch (ETipPersonal) {
            case Brancardier:
                return new Brancardier(nume);
            case Asistent:
                return new Asistent(nume);
            case Medic:
                return new Medic(nume);
            default:
                throw new RuntimeException("Tipul personalului: "  + ETipPersonal + "nu este valid:");
        }
    }
}
