package br.eng.corsini.documento;

public class Sigilo implements Visitante {
    @Override
    public boolean visitar(Texto t){
        return t.isSigilo();
    }
    @Override
    public boolean visitar(Planilha p){
        return p.isConfidencial();
    }
    @Override
    public boolean visitar(Desenho d){
        return !d.isPublico();
    }

}
