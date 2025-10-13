package br.eng.corsini.linguagem;

public class Numero implements Termo {
    private double valor;
    protected Numero(){}
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
