package br.eng.corsini.documento;

public abstract class Documento {
    private String nome;
    private String path;
    public abstract boolean aceitar(Visitante v);
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
}
