package br.eng.corsini.thor;

import java.util.ArrayList;
import java.util.List;

public abstract class Ser {
    private String nome;
    private String sexo;
    private boolean vivo;
    private List<Ser> filhos = new ArrayList<Ser>();
    private List<Artefato> artefatos = new ArrayList<Artefato>();
    private Territorio mora;
    
    public List<Artefato> getArtefatos() {
        return artefatos;
    }
    public void setArtefatos(List<Artefato> artefatos) {
        this.artefatos = artefatos;
    }
    public Territorio getMora() {
        return mora;
    }
    public void setMora(Territorio mora) {
        this.mora = mora;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public List<Ser> getFilhos() {
        return filhos;
    }
    public void setFilhos(List<Ser> filhos) {
        this.filhos = filhos;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
