package br.eng.corsini.thor;

import java.util.ArrayList;
import java.util.List;

public class Artefato {
    private String nome;
    private String material;
    private boolean destruido;
    private String objeto;
    private List<Artefato> poderes = new ArrayList<Artefato>();
    private Portal portal;
 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public boolean isDestruido() {
        return destruido;
    }
    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }
    public String getObjeto() {
        return objeto;
    }
    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }
    public List<Artefato> getPoderes() {
        return poderes;
    }
    public void setPoderes(List<Artefato> poderes) {
        this.poderes = poderes;
    }
    public Portal getPortal() {
        return portal;
    }
    public void setPortal(Portal portal) {
        this.portal = portal;
    }

}
