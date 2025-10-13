package br.eng.corsini.lab08.gourmet;

public class Mexer extends Passo {
    public Mexer(float quantidade, String unidade, String ingrediente, int minutos) {
        super(quantidade, unidade, ingrediente);
        this.minutos = minutos;
    }
    private int minutos;
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
