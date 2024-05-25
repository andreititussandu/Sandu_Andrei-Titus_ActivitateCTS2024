import SimpleFactory.ETipPersonal;
import SimpleFactory.PersonalSpital;
import SimpleFactory.PersonalSpitalFactory;

public class Main {
    public static void main(String[] args) {
        PersonalSpital brancardier = PersonalSpitalFactory.createPersonal("Sandu Andrei", ETipPersonal.Brancardier);
        PersonalSpital asistent = PersonalSpitalFactory.createPersonal("Ionescu Cristina", ETipPersonal.Asistent);
        PersonalSpital medic = PersonalSpitalFactory.createPersonal("Popescu Bogdan", ETipPersonal.Medic);

        System.out.println(brancardier);
        System.out.println(asistent);
        System.out.println(medic);
    }
}
