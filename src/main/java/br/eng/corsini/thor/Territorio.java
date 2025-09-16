package br.eng.corsini.thor;

public abstract class Territorio {
    private String nome;
    private float area;
    private Reino reino;
    public Territorio(Reino reino) {
        this.reino = reino;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public Reino getReino() {
        return reino;
    }
    public void setReino(Reino reino) {
        this.reino = reino;
    }
    
}
