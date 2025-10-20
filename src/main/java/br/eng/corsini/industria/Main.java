package br.eng.corsini.industria;

public class Main {
    public static void main(String[] args) {
        Departamento d = new Departamento();
        d.setNome("IESTI");
        Funcionario f = new Funcionario();
        f.setNome("Corsini");
        f.setDepartamento(d);
        Projeto p = new Projeto();
        p.setNumero(666);
        p.setDepartamento(d);
        p.setGerente(f);
        Componente c = new Componente();
        c.setProjeto(p);
        p.getComponentes().add(c);
        System.out.println(p.getGerente().getNome());

    }
}