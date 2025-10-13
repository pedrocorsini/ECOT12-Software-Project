package br.eng.corsini.thor;

public class Reino {
    private String nome;
    private String simbolo;
    private Divindade governante;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    public Divindade getGovernante() {
        return governante;
    }
    public void setGovernante(Divindade governante) {
        this.governante = governante;
    }
}