package dominio.prenda.tipoPrenda;

import dominio.prenda.tipoPrenda.CategoriaPrenda;

public class Camisa extends  TipoPrenda{
    CategoriaPrenda categoria;
    String nombre;

    public Camisa() {
        this.categoria= CategoriaPrenda.PARTE_SUPERIOR;
        this.nombre = "Camisa";
    }
}
