package bancacorro;

import java.util.ArrayList;
import java.util.List;

public class Cartera implements PatronCartera {
    private String anho;
    private List<Tarjeta> tarjetas;
    
    public Cartera (String anho) {
        this.anho = anho;
        this.tarjetas=new ArrayList<>();
    }

    @Override
    public void agregarTarjeta(Tarjeta t) {
        tarjetas.add(t);
    }
    
    @Override
    public void imprimirListaDeTarjetas() {
        for (Tarjeta t : tarjetas) {
            System.out.println(t.info());
        }
    }
}
