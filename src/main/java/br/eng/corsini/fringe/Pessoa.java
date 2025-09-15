package br.eng.corsini.fringe;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String graduacao;
    private Universo universo;

    public Pessoa(Universo universo) {  //constructor
        this.universo = universo;
    }

    public int incapcita(){
        return universo.vph(idade);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getGraduacao() {
        return graduacao;
    }
    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
    public Universo getUniverso() {
        return universo;
    }
    public void setUniverso(Universo universo) {
        this.universo = universo;
    }
}
