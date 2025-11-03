package br.eng.corsini.hulk;

public class Selvagem implements Estado{
    private int resistencia;
    private int agilidade;
    private int regeneracao;
    @Override
    public void transicao(Pessoa p) {
        if(p.getRaiva()<=0.8){
            p.setEstado(new Civilizado());
        }
    }
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public int getAgilidade() {
        return agilidade;
    }
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
    public int getRegeneracao() {
        return regeneracao;
    }
    public void setRegeneracao(int regeneracao) {
        this.regeneracao = regeneracao;
    }

}

