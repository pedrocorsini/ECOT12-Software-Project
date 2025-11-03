package br.eng.corsini.hulk;

public class Pessoa {
    private String nome;
    private float raiva;
    private String profissao;
    private Estado estado = new Civilizado();
    public void avaliar(){
        estado.transicao(this);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getRaiva() {
        return raiva;
    }
    public void setRaiva(float raiva) {
        this.raiva = raiva;
        estado.transicao(this);
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
