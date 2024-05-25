import Builder.Pacient;
import Builder.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientBuilder("Sandu Andrei")
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .setPapuciCamera(true)
                .build();

        System.out.println(pacient1);

        Pacient pacient2 = new PacientBuilder("Deftu Dan")
                .setPatRabatabil(true)
                .setHalatInterior(true)
                .build();

        System.out.println(pacient2);
    }
}
