package br.eng.corsini.thor;

public class Cidade extends Territorio{
    private boolean energia;
    private boolean abandonada;
    public Cidade(Reino reino) {
        super(reino);
    }
    public boolean isEnergia() {
        return energia;
    }
    public void setEnergia(boolean energia) {
        this.energia = energia;
    }
    public boolean isAbandonada() {
        return abandonada;
    }
    public void setAbandonada(boolean abandonada) {
        this.abandonada = abandonada;
    }

}
