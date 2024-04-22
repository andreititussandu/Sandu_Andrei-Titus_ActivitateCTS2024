public class PersonalSpitalFactory {
    public static PersonalSpital createPersonal(String nume, TipPersonal tipPersonal) {
        switch (tipPersonal) {
            case Brancardier:
                return new Brancardier(nume);
            case Asistent:
                return new Asistent(nume);
            case Medic:
                return new Medic(nume);
            default:
                throw new RuntimeException("Tipul personalului: "  + tipPersonal + "nu este valid:");
        }
    }
}
