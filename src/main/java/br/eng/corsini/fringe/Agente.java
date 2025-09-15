package br.eng.corsini.fringe;

public class Agente extends Pessoa {

    public Agente(Universo universo) { // super constructor due to dependency Pessoa -> Universo
        super(universo);
    }

    private String capacidade;

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
    

}
