package br.eng.corsini.documento;

public class Texto extends Documento {
    private boolean sigilo;
    private String conteudo;
    public void resumo280(){}
    public void imprimirTudo(){}
    @Override
    public boolean aceitar(Visitante v){
        return v.visitar(this);
    }
    public boolean isSigilo() {
        return sigilo;
    }
    public void setSigilo(boolean sigilo) {
        this.sigilo = sigilo;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
