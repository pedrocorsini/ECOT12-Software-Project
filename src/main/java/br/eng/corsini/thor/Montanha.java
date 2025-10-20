package br.eng.corsini.thor;

public class Montanha extends Territorio{

    public Montanha(Reino reino) {
        super(reino);
    }
    private String tipoPedra;
    public String getTipoPedra() {
        return tipoPedra;
    }
    public void setTipoPedra(String tipoPedra) {
        this.tipoPedra = tipoPedra;
    }

}   
