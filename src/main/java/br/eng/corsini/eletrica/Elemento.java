package br.eng.corsini.eletrica;

public abstract class Elemento {
    private String rotulo;
    public abstract int totalElementos();
    public String getRotulo() {
        return rotulo;
    }
    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }
    
}
