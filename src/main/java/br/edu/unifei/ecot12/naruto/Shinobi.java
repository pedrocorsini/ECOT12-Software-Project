package br.edu.unifei.ecot12.naruto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shinobi extends Ser {
    private String sexo;
    private Date nascimento;
    private String categoria;
    private boolean renegado;
    private Bijuu bijuu;
    public Bijuu getBijuu() {
        return bijuu;
    }
    public void setBijuu(Bijuu bijuu) {
        this.bijuu = bijuu;
    }
    private List<KekkeiGenkai> kekkeiGenkais = new ArrayList<KekkeiGenkai>();
    public String getSexo() {
        return sexo;
    }
    public List<KekkeiGenkai> getKekkeiGenkais() {
        return kekkeiGenkais;
    }
    public void setKekkeiGenkais(List<KekkeiGenkai> kekkeiGenkais) {
        this.kekkeiGenkais = kekkeiGenkais;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public boolean isRenegado() {
        return renegado;
    }
    public void setRenegado(boolean renegado) {
        this.renegado = renegado;
    }
    
}
