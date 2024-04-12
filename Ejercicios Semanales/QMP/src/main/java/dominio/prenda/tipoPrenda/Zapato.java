package dominio.prenda.tipoPrenda;

import dominio.prenda.tipoPrenda.CategoriaPrenda;

public class Zapato extends TipoPrenda {
    CategoriaPrenda categoria;
    String nombre;

    public Zapato() {
        this.categoria = CategoriaPrenda.CALZADO;
        this.nombre = "Zapato";
    }
}
