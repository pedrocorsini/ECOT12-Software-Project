package br.eng.corsini.fringe;

public class Cientista extends Pessoa {

    public Cientista(Universo universo) {
        super(universo);
    }

    private String mestrado;
    private String doutorado;
    private int publicacao;
    private int fraudes;
    public String getMestrado() {
        return mestrado;
    }
    public void setMestrado(String mestrado) {
        this.mestrado = mestrado;
    }
    public String getDoutorado() {
        return doutorado;
    }
    public void setDoutorado(String doutorado) {
        this.doutorado = doutorado;
    }
    public int getPublicacao() {
        return publicacao;
    }
    public void setPublicacao(int publicacao) {
        this.publicacao = publicacao;
    }
    public int getFraudes() {
        return fraudes;
    }
    public void setFraudes(int fraudes) {
        this.fraudes = fraudes;
    }

}
