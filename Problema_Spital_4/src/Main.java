import java.util.List;

public class Main {
    public static void main(String[] args) {

        Reteta retetaOriginala = new Reteta();
        retetaOriginala.adaugaSolutie("SolutieA", 500);
        retetaOriginala.adaugaSolutie("SolutieB", 200);

        Reteta retetaCopie = retetaOriginala.clone();

        retetaCopie.adaugaSolutie("SolutieC", 450);
        List<Solutie> solutiiCopiate = retetaCopie.getSolutii();
        for (Solutie solutie : solutiiCopiate) {
            if (solutie.getDenumire().equals("SolutieB")) {
                solutie.setCantitate(1000);
            }
        }

        afiseazaSolutii("Rețeta originală:", retetaOriginala.getSolutii());
        afiseazaSolutii("Rețeta copiată:", retetaCopie.getSolutii());
    }

    private static void afiseazaSolutii(String descriere, List<Solutie> solutii) {
        System.out.println(descriere);
        for (Solutie solutie : solutii) {
            System.out.println(solutie.getDenumire() + ": " + solutie.getCantitate());
        }
    }
}
