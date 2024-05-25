import SimpleFactory.ETipSupa;
import SimpleFactory.SoupFactory;
import SimpleFactory.Supa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Supa supaDeLegume = SoupFactory.creareSupa(ETipSupa.LEGUME);
        supaDeLegume.prepara();

        Supa supaDeCiuperci = SoupFactory.creareSupa(ETipSupa.CIUPERCI);
        supaDeCiuperci.prepara();

        Supa supaDeVita = SoupFactory.creareSupa(ETipSupa.VITA);
        supaDeVita.prepara();
    }

}