package br.eng.corsini.gourmet;

public class Outro extends Passo {
    private String acao;
    public Outro(String acao, float quantidade, String unidade, String ingrediente){
        super(quantidade, unidade, ingrediente);
        this.acao = acao;
    }
    public String getAcao() {
        return acao;
    }
    public void setAcao(String acao) {
        this.acao = acao;
    }
    
}
