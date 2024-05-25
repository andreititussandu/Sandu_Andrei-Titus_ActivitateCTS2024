import Builder.Rezervare;
import Builder.RezervareBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare = builder.setAreMancare(false).setAreScaunErgonomic(true)
                .setAreBautura(true).setAreMuzicaAmbientala(true).setGenMuzica("rock").build();

        System.out.println(rezervare);
    }
}