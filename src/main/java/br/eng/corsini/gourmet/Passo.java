package br.eng.corsini.gourmet;

public abstract class Passo {
    private float quantidade;
    private String unidade;
    private String ingrediente;
    private Passo emSeguida;
    
    public Passo(float quantidade, String unidade, String ingrediente) {
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.ingrediente = ingrediente;
    }

    public int quantosPassos(){
        if(emSeguida == null){
            return 1;
        }else{  
            return 1 + emSeguida.quantosPassos();
        }
    }
    

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Passo getEmSeguida() {
        return emSeguida;
    }

    public Passo setEmSeguida(Passo emSeguida) {
        this.emSeguida = emSeguida;
        return this.emSeguida;
    }


}
