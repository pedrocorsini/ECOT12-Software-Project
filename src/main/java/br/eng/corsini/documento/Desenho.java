package br.eng.corsini.documento;

public class Desenho extends Documento {
    private boolean publico;
    private int paletaCores;
    private int linhas;
    private int colunas;
    public void apresentar(){}
    public void apresentarFullHd(){}
    public void apresentar4k(){}
    @Override
    public boolean aceitar(Visitante v){
        return v.visitar(this);
    }
    public boolean isPublico() {
        return publico;
    }
    public void setPublico(boolean publico) {
        this.publico = publico;
    }
    public int getPaletaCores() {
        return paletaCores;
    }
    public void setPaletaCores(int paletaCores) {
        this.paletaCores = paletaCores;
    }
    public int getLinhas() {
        return linhas;
    }
    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }
    public int getColunas() {
        return colunas;
    }
    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
    
}
