package br.eng.corsini.hulk;

public class Civilizado implements Estado {
    private int raciocinio;
    private int observacao;
    @Override
    public void transicao(Pessoa p){
        if(p.getRaiva()>0.8){
            p.setEstado(new Selvagem());
        }
    }
    public int getRaciocinio() {
        return raciocinio;
    }
    public void setRaciocinio(int raciocinio) {
        this.raciocinio = raciocinio;
    }
    public int getObservacao() {
        return observacao;
    }
    public void setObservacao(int observacao) {
        this.observacao = observacao;
    }
}
