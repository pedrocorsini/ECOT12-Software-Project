package br.eng.corsini.documento;

public interface Visitante {
    public boolean visitar(Texto t);
    public boolean visitar(Planilha p);
    public boolean visitar(Desenho p);
}
