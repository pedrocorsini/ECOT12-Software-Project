package br.unifei.ecot12.industria;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private int numero;
    private float orcamento;
    private Funcionario gerente;
    private Departamento departamento;
    private List<Componente> componentes = new ArrayList<Componente>();

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public float getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }
    public Funcionario getGerente() {
        return gerente;
    }
    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public List<Componente> getComponentes() {
        return componentes;
    }
    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }
}
