import java.util.ArrayList;
import java.util.List;

public class GeneratorUdalosti {
    private final List<Posluchac> posluchaci = new ArrayList<>(); // seznam posluchačů

    public void pridejPosluchace(Posluchac posluchac) {
        posluchaci.add(posluchac); // přidání posluchače do seznamu
    }
    public void generujUdalost() { // když spustím událost předá se info posluchačům
        for( Posluchac posluchac : posluchaci) {
            posluchac.zpracujUdalost(); // zavolání metody zpracujUdalost() na každém posluchači
        }

    }
}
