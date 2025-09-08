package br.eng.corsini.naruto;

import java.util.ArrayList;
import java.util.List;

public class Vila extends EntidadePolitica{
    private String localizacao;
    private String bandana;
    private List<Ser> membros = new ArrayList<Ser>();
    private List<Cla> clas = new ArrayList<Cla>();
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getBandana() {
        return bandana;
    }
    public void setBandana(String bandana) {
        this.bandana = bandana;
    }
    public List<Ser> getMembros() {
        return membros;
    }
    public void setMembros(List<Ser> membros) {
        this.membros = membros;
    }
    public List<Cla> getClas() {
        return clas;
    }
    public void setClas(List<Cla> clas) {
        this.clas = clas;
    }

}
