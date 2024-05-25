import SimpleFactory.ETipJucator;
import SimpleFactory.Jucator;
import SimpleFactory.JucatorFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        Jucator portar = JucatorFactory.creareJucator(ETipJucator.PORTAR);
        portar.devineProfesionist();

        Jucator fundas = JucatorFactory.creareJucator(ETipJucator.FUNDAS);
        fundas.devineProfesionist();

        Jucator atacant = JucatorFactory.creareJucator(ETipJucator.ATACANT);
        atacant.devineProfesionist();
    }
}