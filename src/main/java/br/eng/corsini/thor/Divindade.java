package br.eng.corsini.thor;

import java.util.ArrayList;
import java.util.List;

public abstract class Divindade extends Ser {
    private String fraqueza;
    private List<Poder> poderes = new ArrayList<Poder>();
    public String getFraqueza() {
        return fraqueza;
    }
    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }
    public List<Poder> getPoderes() {
        return poderes;
    }
    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }
    
}
