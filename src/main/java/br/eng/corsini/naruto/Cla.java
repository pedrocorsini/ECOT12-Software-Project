package br.eng.corsini.naruto;

import java.util.ArrayList;
import java.util.List;

public class Cla extends EntidadePolitica{
    private String simbolo;
    private List<Shinobi> shinobis = new ArrayList<Shinobi>();
    public String getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    public List<Shinobi> getShinobis() {
        return shinobis;
    }
    public void setShinobis(List<Shinobi> shinobis) {
        this.shinobis = shinobis;
    }
    
}
