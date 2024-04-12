package dominio.prenda;


import dominio.prenda.tipoPrenda.TipoPrenda;

public class Prenda {
    TipoPrenda tipoPrenda;

    Color colorPrimario;
    Color colorSecuncario;

    Tela tela;

    public Prenda(TipoPrenda tipoPrenda, Color colorPrimario, Color colorSecuncario, Tela tela) {
        this.tipoPrenda = tipoPrenda;
        this.colorPrimario = colorPrimario;
        this.colorSecuncario = colorSecuncario;
        this.tela = tela;
    }

    public Prenda(TipoPrenda tipoPrenda, Tela tela, Color colorPrimario) {
        this.tipoPrenda = tipoPrenda;
        this.tela = tela;
        this.colorPrimario = colorPrimario;
    }
}
