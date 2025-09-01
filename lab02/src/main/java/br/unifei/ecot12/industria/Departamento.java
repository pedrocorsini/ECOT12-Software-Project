package br.unifei.ecot12.industria;

public class Departamento {
    private String nome;
    private float orcamento;
    private String sigla;
    private String localizacao;
    private Funcionario gerente;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public Funcionario getGerente() {
        return gerente;
    }
    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
}
