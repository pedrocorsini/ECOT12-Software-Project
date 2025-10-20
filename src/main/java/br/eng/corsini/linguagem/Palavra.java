package br.eng.corsini.linguagem;

public class Palavra implements Termo{
    private String caracteres;
    protected Palavra(){}
    public String getCaracteres() {
        return caracteres;
    }
    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }
    
}
