package br.eng.corsini.industria;

import java.sql.Date;

public class Funcionario {
    private int matricula;
    private String nome;
    private Date admissao;
    private float salario;
    private Departamento departamento;
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getAdmissao() {
        return admissao;
    }
    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
