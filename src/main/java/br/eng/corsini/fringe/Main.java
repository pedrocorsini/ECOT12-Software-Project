package br.eng.corsini.fringe;

public class Main {
    public static void main(String[] args) {
        Real r = new Real();
        Agente a = new Agente(r);
        a.setNome("Olivia");
        a.setIdade(26);
        System.out.println(a.incapcita());
        Cientista c = new Cientista(new Alternativo());
        c.setNome("Peter");
        c.setIdade(26);
        System.out.println(c.incapcita());
    }
}