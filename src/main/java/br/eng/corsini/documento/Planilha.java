package br.eng.corsini.documento;

public class Planilha extends Documento{
    private boolean confidencial;
    private int ultimaLinha;
    private int ultimaColuna;
    public void unicaPagina(){}
    public void multiplasPaginas(){}
    @Override
    public boolean aceitar(Visitante v){
        return v.visitar(this);
    }
    public boolean isConfidencial() {
        return confidencial;
    }
    public void setConfidencial(boolean confidencial) {
        this.confidencial = confidencial;
    }
    public int getUltimaLinha() {
        return ultimaLinha;
    }
    public void setUltimaLinha(int ultimaLinha) {
        this.ultimaLinha = ultimaLinha;
    }
    public int getUltimaColuna() {
        return ultimaColuna;
    }
    public void setUltimaColuna(int ultimaColuna) {
        this.ultimaColuna = ultimaColuna;
    }
    
}
