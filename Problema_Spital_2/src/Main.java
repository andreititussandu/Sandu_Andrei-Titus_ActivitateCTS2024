public class Main {
    public static void main(String[] args) {
        PersonalSpital brancardier = PersonalSpitalFactory.createPersonal("Sandu Andrei", TipPersonal.Brancardier);
        PersonalSpital asistent = PersonalSpitalFactory.createPersonal("Ionescu Cristina", TipPersonal.Asistent);
        PersonalSpital medic = PersonalSpitalFactory.createPersonal("Popescu Bogdan", TipPersonal.Medic);

        System.out.println(brancardier);
        System.out.println(asistent);
        System.out.println(medic);
    }
}
