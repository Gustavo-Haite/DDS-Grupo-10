package dominio.atuendo;

import dominio.prenda.Prenda;

import java.util.Collections;
import java.util.List;

public class Atuendo {
    List<Prenda> prendas;
    public void agregarPrendas(Prenda ... prenda) {
        Collections.addAll(this.prendas, prenda);
    }
}
